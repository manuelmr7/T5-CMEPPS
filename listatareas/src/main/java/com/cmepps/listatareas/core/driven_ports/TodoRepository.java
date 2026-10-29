package com.cmepps.listatareas.core.driven_ports;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cmepps.listatareas.Entity.Todo;

public interface TodoRepository {
	List < Todo > findByUserName(String user);
}
