package com.test.exam.realtimeairquality.data.sensor;

public class SensorDataIO {
	private double temperatureValue = 0.0d;
	private double humidityValue = 0.0d;
	private double noiseValue = 0.0d;
	private double ozoneValue = 0.0d;
	private double pm2_5Value = 0.0d;
	private double pm10Value = 0.0d;
	private double co2Value = 0.0d;
	private SensorCalculator sensorCalculator;
	public void SensorDataIO() {
		sensorCalculator = new SensorCalculator();
	}
	
    public void setTempratureValue(int sensorRawValue) {
    	temperatureValue = sensorCalculator.calculateTemperatureValue(sensorRawValue);
    }
	public double getTemperatureValue() {
		return temperatureValue;
	}
    public void setHumidityValue(int sensorRawValue) {
    	
    }
	public double getHumidityValue() {
		double value = 0.0d;
		return value;
	}
    public void setNoiseValue(int sensorRawValue) {
    	
    }
	public double getNoiseValue() {
		double value = 0.0d;
		return value;
	}
    public void setOzoneValue(int sensorRawValue) {
    	
    }
	public double getOzoneValue() {
		double value = 0.0d;
		return value;
	}
	public void setPM2_5Value(int sensorRawValue) {
		
	}
	public double getPM2_5Value() {
		double value = 0.0d;
		return value;
	}
	public void setPM10Value(int sensorRawValue) {
		
	}
	public double getPM10Value() {
		double value = 0.0d;
		return value;
	}
	public void setCO2Value(int sensorRawValue) {
		
	}
	public double getCO2Value() {
		double value = 0.0d;
		return value;
	}

}
