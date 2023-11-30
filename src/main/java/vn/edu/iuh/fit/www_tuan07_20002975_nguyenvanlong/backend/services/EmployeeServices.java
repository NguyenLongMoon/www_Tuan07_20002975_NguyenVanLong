package vn.edu.iuh.fit.www_tuan07_20002975_nguyenvanlong.backend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.edu.iuh.fit.www_tuan07_20002975_nguyenvanlong.backend.enums.EmployeeStatus;
import vn.edu.iuh.fit.www_tuan07_20002975_nguyenvanlong.backend.models.Employee;
import vn.edu.iuh.fit.www_tuan07_20002975_nguyenvanlong.backend.repositories.EmployeeRepository;

import java.util.Optional;

@Service
public class EmployeeServices {
    @Autowired
    private EmployeeRepository employeeRepository;

    public Optional<Employee> login(String phone) {
        return employeeRepository.login(phone, EmployeeStatus.TERMINATED);
    }
}
