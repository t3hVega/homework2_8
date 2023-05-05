package com.homework.homework28.model;

import java.util.Objects;

public class Contract {
    private Integer contractNumber;
    public Contract(Integer contractNumber) {
        this.contractNumber = contractNumber;
    }
    public Integer getContractNumber() {
        return contractNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contract contract = (Contract) o;
        return Objects.equals(contractNumber, contract.contractNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(contractNumber);
    }

    @Override
    public String toString() {
        return "Contract{" +
                "contractNumber=" + contractNumber +
                '}';
    }
}
