package com.emp.employeemanagement.utils;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

public class EmployeManagementUtils {
	
	private static final Logger logger = LoggerFactory.getLogger(EmployeManagementUtils.class);
	
	private EmployeManagementUtils() {}
		
	public static String decrypt(String str) {
		logger.info("class @EmployeManagementUtils method @decrypt string = {}",str);
		BASE64Decoder decode = new BASE64Decoder();
		String decodeString = null;
		try {
			decodeString = new String(decode.decodeBuffer(str));
			logger.info("class @EmployeManagementUtils method @decrypt string after decrypt = {}",decodeString);
		} catch (IOException e) {
			logger.error("Error class @EmployeManagementUtils method @decrypt string after decrypt = {}",decodeString);
			e.printStackTrace();
		}
		
		return decodeString;
	}
	
	public static String encrypt(String str) {
		logger.info("class @EmployeManagementUtils method @encrypt string = {}",str);
		BASE64Encoder decode = new BASE64Encoder();
		String encodeString = decode.encodeBuffer(str.getBytes());
		logger.info("class @EmployeManagementUtils method @encrypt string after encrypt = {}",encodeString);
		return encodeString;
	}
}
