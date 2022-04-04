package bd.org.spcbl.inventorymanagement.repository;

import bd.org.spcbl.inventorymanagement.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address,Integer> {
}
