package io.jafka.jeos.core.response.chain;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.jafka.jeos.core.response.history.transaction.Transaction;
import lombok.Data;

@Data
public class Block {

    private String actionMroot;
    private Long blockNum;
    private Integer confirmed;
    private String id;
    private String previous;
    private String producer;
    private String producerSignature;
    private Long refBlockPrefix;
    private Long scheduleVersion;
    private String timeStamp;
    private String transactionMroot;

    private String actionMerkleRoot;

    private String blockMerkleRoot;

    private String[] newProducers;

    private Transaction[] transactions;

    private String[] headerExtensions;

    private String[] blockExtensions;
}
