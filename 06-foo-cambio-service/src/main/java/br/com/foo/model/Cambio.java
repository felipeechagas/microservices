package br.com.foo.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

public class Cambio implements Serializable {
  private static final long serialVersionUID = 1L;
  private Long id;
  private String from;
  private String to;
  private BigDecimal conversionFactory;
  private BigDecimal convertedValue;
  private String environment;

  public Cambio() {

  }

  public Cambio(Long id, String from, String to, BigDecimal conversionFactory, BigDecimal convertedValue, String environment) {
    this.id = id;
    this.from = from;
    this.to = to;
    this.conversionFactory = conversionFactory;
    this.convertedValue = convertedValue;
    this.environment = environment;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getFrom() {
    return from;
  }

  public void setFrom(String from) {
    this.from = from;
  }

  public String getTo() {
    return to;
  }

  public void setTo(String to) {
    this.to = to;
  }

  public BigDecimal getConversionFactory() {
    return conversionFactory;
  }

  public void setConversionFactory(BigDecimal conversionFactory) {
    this.conversionFactory = conversionFactory;
  }

  public BigDecimal getConvertedValue() {
    return convertedValue;
  }

  public void setConvertedValue(BigDecimal convertedValue) {
    this.convertedValue = convertedValue;
  }

  public String getEnvironment() {
    return environment;
  }

  public void setEnvironment(String environment) {
    this.environment = environment;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Cambio cambio = (Cambio) o;
    return id.equals(cambio.id) && from.equals(cambio.from) && to.equals(cambio.to) && conversionFactory.equals(cambio.conversionFactory) && convertedValue.equals(cambio.convertedValue) && environment.equals(cambio.environment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, from, to, conversionFactory, convertedValue, environment);
  }
}
