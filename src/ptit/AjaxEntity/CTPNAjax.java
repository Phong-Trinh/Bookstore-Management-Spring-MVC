package ptit.AjaxEntity;

public class CTPNAjax {
	private Integer id;
	private Integer quantity;
	
	public CTPNAjax() {
		super();
	}

	public CTPNAjax(Integer id, Integer quantity) {
		super();
		this.id = id;
		this.quantity = quantity;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "CTPNAjax [id=" + id + ", quantity=" + quantity + "]";
	}
}
