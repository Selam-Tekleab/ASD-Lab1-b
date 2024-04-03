package edu.miu.cs489.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

import java.time.LocalDate;
import java.util.Date;

@Getter
@Data
@AllArgsConstructor
public class PensionPlan {

    private int planReferenceNumber;
    private LocalDate enrollmentDate;
    private double monthlyContribution;

    @Override
    public String toString() {
        return "PensionPlan{" +
                "planReferenceNumber=" + planReferenceNumber +
                ", enrollmentDate=" + enrollmentDate +
                ", monthlyContribution=" + monthlyContribution +
                '}';
    }
}
