/*
 * This file is part of RskJ
 * Copyright (C) 2017 RSK Labs Ltd.
 * (derived from ethereumJ library, Copyright (c) 2016 <ether.camp>)
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */

package org.ethereum.db;

import co.rsk.crypto.Sha3Hash;
import org.ethereum.core.TransactionReceipt;

import java.util.List;

/**
 * Created by Ruben on 6/1/2016.
 * Interface used for store transaction receipts
 */

public interface ReceiptStore {

    void add(Sha3Hash blockHash, int transactionIndex, TransactionReceipt receipt);

    TransactionInfo get(Sha3Hash transactionHash);

    TransactionInfo get(Sha3Hash transactionHash, Sha3Hash blockHash, BlockStore store);

    TransactionInfo getInMainChain(Sha3Hash transactionHash, BlockStore store);

    List<TransactionInfo> getAll(Sha3Hash transactionHash);

    void saveMultiple(Sha3Hash blockHash, List<TransactionReceipt> receipts);
}
