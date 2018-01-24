/*
 * Copyright 2013-2017 (c) MuleSoft, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific
 * language governing permissions and limitations under the License.
 */
package org.raml.jaxrs.examples.multipart;

import org.raml.jaxrs.common.RamlGenerator;
import org.raml.jaxrs.handlers.SimpleJaxbClassParser;
import org.raml.pojotoraml.RamlAdjuster;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * Created by Jean-Philippe Belanger on 3/26/17. Just potential zeroes and ones
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.PROPERTY)
@RamlGenerator(parser = SimpleJaxbClassParser.class)
public class ConsumedValue {

  @XmlElement
  private String name;

  private int id;

  private List<String> names;

  public int getId() {
    return id;
  }

  public List<String> getNames() {
    return names;
  }
}
