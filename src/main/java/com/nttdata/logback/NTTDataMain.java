package com.nttdata.logback;

import java.util.Random;
import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 
 * Clase principal
 *
 * @author santiagomr
 *
 */
public class NTTDataMain {

	/** LOGGER */
	private static final Logger LOG = LoggerFactory.getLogger(NTTDataMain.class);

	public static void main(String[] args) {

		LOG.info("Método: main() | TRAZA INICIAL");

		/** Generacion de numeros loteria */
		final int maxNumber = 99999;
		final Random number = new Random();
		int randomNumber = number.nextInt(maxNumber);
		LOG.debug("LotteryNumber: {}", randomNumber);

		/** Verifica si el rango de numeros es el adecuado */
		validatorLottery(823);

		for (int i = 0; i <= 6000; i++) {
			LOG.info("Iteración {}", i);
		}

		LOG.info("Método: main() | TRAZA FINAL");
	}

	/**
	 * Comprueba si el numero introducido se encuentra en el rango apropiado.
	 * 
	 * @param entryNumber
	 */

	public static void validatorLottery(int entryNumber) {
		LOG.info("Método: validatorLottery() | TRAZA INICIAL");

		if (entryNumber >= 0 && entryNumber <= 99999) {
			LOG.info("El numero que se le ha generado al usuario {} tiene un rango adecuado.", entryNumber);
		}

		else {
			LOG.warn("El numero que se le ha generado al usuario {} tiene un rango incorrecto.", entryNumber);
		}

		LOG.info("Método: validatorLottery() | TRAZA FINAL");
	}
}
