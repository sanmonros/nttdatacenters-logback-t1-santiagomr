package com.nttdata.logback;

import java.util.Date;

import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.LayoutBase;

/**
 * Layout personalizado
 * 
 * @author santiagomr
 *
 */

public class NTTDataLayout extends LayoutBase<ILoggingEvent> {
	/** Imprime prefijo */
	private String prefix;

	/** Imprime nombre del hilo */
	private boolean printThreadName = Boolean.TRUE;

	/**
	 * Genera el layout.
	 * 
	 * @param event
	 * @return String
	 */
	public String doLayout(ILoggingEvent event) {

		// Inicializacion buffer
		final StringBuilder sbuf = new StringBuilder(128);

		sbuf.append(new Date(event.getTimeStamp()));
		sbuf.append(" ");
		sbuf.append(prefix);
		sbuf.append(" ");
		sbuf.append(event.getLevel());

		if (printThreadName) {
			sbuf.append(" [");
			sbuf.append(event.getThreadName());
			sbuf.append("]");
		}

		sbuf.append(" ");
		sbuf.append(event.getLoggerName());
		sbuf.append(" - ");
		sbuf.append(event.getFormattedMessage());
		sbuf.append("\n");

		return sbuf.toString();
	}

	/**
	 * @return the prefix
	 */
	public String getPrefix() {
		return prefix;
	}

	/**
	 * @param prefix the prefix to set
	 */
	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}

	/**
	 * @return the printThreadName
	 */
	public boolean isPrintThreadName() {
		return printThreadName;
	}

	/**
	 * @param printThreadName the printThreadName to set
	 */
	public void setPrintThreadName(boolean printThreadName) {
		this.printThreadName = printThreadName;
	}
}
