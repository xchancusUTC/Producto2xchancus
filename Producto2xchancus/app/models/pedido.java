package models;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.jboss.logging.FormatWith;

import com.avaje.ebean.Model;

import play.data.format.Formats;
import play.data.validation.Constraints;

@Entity
public class pedido extends Model{
	
			private static final long serialVersionUID = 1L;

		@Id
	    public Long id;
	    
	    @Constraints.Required
	    public String name;
	   
	    public String tipo;
	    public long cantidad;
	    public long precio;
	        
	    @ManyToOne
	    public restaurante restaurante;
	    
	    

	    public static Find<Long,pedido> find =new Find<Long,pedido>(){};
		public static List<pedido> listadopedido() {
			// TODO Auto-generated method stub
			
			return find.all();
		}

	}





