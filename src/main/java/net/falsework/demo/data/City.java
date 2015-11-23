package net.falsework.demo.data;

import javax.persistence.Column;
import javax.persistence.Entity;

import net.falsework.data.orm.entity.BaseEntity;

@Entity
public class City extends BaseEntity {

	private static final long serialVersionUID = 1L;

	@Column(nullable = false)
	private String name;

	@Column(nullable = false)
	private String state;

	public City() { }

	public City(String name, String state) {
		this.name = name;
		this.state = state;
	}

	public String getName() {
		return this.name;
	}

	public String getState() {
		return this.state;
	}
}
