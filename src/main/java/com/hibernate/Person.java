package com.hibernate;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Person {
		@Id
		private int id;
		private String name;
		
		@OneToMany
		private List<PersonAddress> personAddresses;
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public List<PersonAddress> getPersonAddresses() {
			return personAddresses;
		}
		public void setPersonAddresses(List<PersonAddress> personAddresses) {
			this.personAddresses = personAddresses;
		}
		@Override
		public String toString() {
			return "Person [id=" + id + ", name=" + name + ", personAddresses=" + personAddresses + "]";
		}
		
		
}
