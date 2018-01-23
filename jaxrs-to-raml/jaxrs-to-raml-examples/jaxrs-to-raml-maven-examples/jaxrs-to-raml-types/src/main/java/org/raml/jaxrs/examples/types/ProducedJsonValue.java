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
package org.raml.jaxrs.examples.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.raml.jaxrs.common.RamlGenerator;
import org.raml.jaxrs.handlers.SimpleJacksonClassParser;
import org.raml.jaxrs.handlers.SimpleJacksonTypes;

/**
 * Created by Jean-Philippe Belanger on 4/17/17. Just potential zeroes and ones
 */
@RamlGenerator(SimpleJacksonClassParser.class)
public class ProducedJsonValue {

  @JsonProperty
  int id;

  @JsonProperty
  public String getName() {
    return null;
  }
}
