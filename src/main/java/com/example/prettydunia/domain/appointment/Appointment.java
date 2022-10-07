package com.example.prettydunia.domain.appointment;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.Instant;

@Entity
@Table(name = "appointment")
@NoArgsConstructor
@Getter
@Setter
public class Appointment {

    @Id
    private long id;

    private String clientName;

    private String associatedAgentName;

    private String appointmentDescription;

    private float appointmentPrice;

    private Instant appointmentDate;

    private AppointmentStatus appointmentStatus;


    public Appointment(String clientName, String associatedAgentName,
                       String appointmentDescription, float appointmentPrice,
                       Instant appointmentDate) {

        this.clientName = clientName;
        this.associatedAgentName = associatedAgentName;
        this.appointmentDescription = appointmentDescription;
        this.appointmentPrice = appointmentPrice;
        this.appointmentDate = appointmentDate;
    }
}
