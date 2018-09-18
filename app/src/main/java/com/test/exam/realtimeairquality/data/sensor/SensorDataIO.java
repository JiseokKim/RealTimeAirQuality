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
		humidityValue = sensorCalculator.calculateHumidityValue(sensorRawValue);
    	
    }
	public double getHumidityValue() {
		return humidityValue;
	}
    public void setNoiseValue(int sensorRawValue) {
    	noiseValue = sensorCalculator.calculateNoiseValue(sensorRawValue);
    }
	public double getNoiseValue() {
		return noiseValue;
	}
    public void setOzoneValue(int sensorRawValue) {
    	ozoneValue = sensorCalculator.calculateOzoneValue(sensorRawValue);
    }
	public double getOzoneValue() {
		return ozoneValue;
	}
	public void setPM2_5Value(int sensorRawValue) {
		pm2_5Value = sensorCalculator.calculatePM2_5Value(sensorRawValue);
	}
	public double getPM2_5Value() {
		return pm2_5Value;
	}
	public void setPM10Value(int sensorRawValue) {
		pm10Value = sensorCalculator.calculatePM10Value(sensorRawValue);
	}
	public double getPM10Value() {
		return pm10Value;
	}
	public void setCO2Value(int sensorRawValue) {
		co2Value = sensorCalculator.calculateCO2Value(sensorRawValue);
	}
	public double getCO2Value() {
		return co2Value;
	}

}
