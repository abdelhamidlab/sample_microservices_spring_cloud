package ihm.ci.techno.project.test.techno_test_for_ihm_ci.entity;

public class Flux {
	
	private long id;
	private String name;
	private String connectorIn;
	private String connectorOut;
	
	
	public Flux() {
		super();
	}


	
	public Flux(long id, String name, String connectorIn, String connectorOut) {
		super();
		this.id = id;
		this.name = name;
		this.connectorIn = connectorIn;
		this.connectorOut = connectorOut;
	}



	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getConnectorIn() {
		return connectorIn;
	}


	public void setConnectorIn(String connectorIn) {
		this.connectorIn = connectorIn;
	}


	public String getConnectorOut() {
		return connectorOut;
	}


	public void setConnectorOut(String connectorOut) {
		this.connectorOut = connectorOut;
	}



	@Override
	public String toString() {
		return "Flux [id=" + id + ", name=" + name + ", connectorIn=" + connectorIn + ", connectorOut=" + connectorOut
				+ "]";
	}
	
	

}
