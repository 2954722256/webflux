package cn.dodo.webflux.exceptions;

import lombok.Data;

@Data
public class XXException extends RuntimeException {

	private static final long serialVersionUID = 1L;


	public XXException() {
		super();
	}

	public XXException(String message, Throwable cause,
                       boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public XXException(String message, Throwable cause) {
		super(message, cause);
	}

	public XXException(String message) {
		super(message);
	}

	public XXException(Throwable cause) {
		super(cause);
	}


	
}
