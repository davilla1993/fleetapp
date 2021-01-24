package com.follytech.fleetapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.follytech.fleetapp.models.VehicleMaintenance;

@Repository
public interface VehicleMaintenancepository extends JpaRepository<VehicleMaintenance, Integer> {

}
