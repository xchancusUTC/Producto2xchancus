package models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ManyToOne;

import javax.persistence.Id;
import javax.validation.Constraint;

import com.avaje.ebean.Model;

import play.data.validation.Constraints;

	public class restaurante  extends Model{

		 private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Long id;
	  
		
	@Constraints.Required
	public String name;
	   
	
}
