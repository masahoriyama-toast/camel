/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.model.endpoint;

import javax.annotation.Generated;
import org.apache.camel.model.AbstractEndpointBuilder;
import org.apache.camel.model.EndpointConsumerBuilder;
import org.apache.camel.model.EndpointProducerBuilder;

/**
 * The fop component allows you to render a message into different output
 * formats using Apache FOP.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface FopEndpointBuilder {


    public static class FopCommonBuilder<T extends AbstractEndpointBuilder>
            extends
                AbstractEndpointBuilder<T> {
        FopCommonBuilder(String path) {
            super("fop", path);
        }
        /**
         * The primary output format is PDF but other output formats are also
         * supported. The option is a
         * org.apache.camel.component.fop.FopOutputType type.
         */
        public T outputType(FopOutputType outputType) {
            this.properties.put("outputType", outputType);
            return (T) this;
        }
        /**
         * The primary output format is PDF but other output formats are also
         * supported. The option will be converted to a
         * org.apache.camel.component.fop.FopOutputType type.
         */
        public T outputType(String outputType) {
            this.properties.put("outputType", outputType);
            return (T) this;
        }
        /**
         * Allows to use a custom configured or implementation of
         * org.apache.fop.apps.FopFactory. The option is a
         * org.apache.fop.apps.FopFactory type.
         */
        public T fopFactory(Object fopFactory) {
            this.properties.put("fopFactory", fopFactory);
            return (T) this;
        }
        /**
         * Allows to use a custom configured or implementation of
         * org.apache.fop.apps.FopFactory. The option will be converted to a
         * org.apache.fop.apps.FopFactory type.
         */
        public T fopFactory(String fopFactory) {
            this.properties.put("fopFactory", fopFactory);
            return (T) this;
        }
        /**
         * The location of a configuration file which can be loaded from
         * classpath or file system. The option is a java.lang.String type.
         */
        public T userConfigURL(String userConfigURL) {
            this.properties.put("userConfigURL", userConfigURL);
            return (T) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities. The option
         * is a boolean type.
         */
        public T basicPropertyBinding(boolean basicPropertyBinding) {
            this.properties.put("basicPropertyBinding", basicPropertyBinding);
            return (T) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities. The option
         * will be converted to a boolean type.
         */
        public T basicPropertyBinding(String basicPropertyBinding) {
            this.properties.put("basicPropertyBinding", basicPropertyBinding);
            return (T) this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported). The option
         * is a boolean type.
         */
        public T synchronous(boolean synchronous) {
            this.properties.put("synchronous", synchronous);
            return (T) this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported). The option
         * will be converted to a boolean type.
         */
        public T synchronous(String synchronous) {
            this.properties.put("synchronous", synchronous);
            return (T) this;
        }
    }

    public static class FopProducerBuilder
            extends
                FopCommonBuilder<FopProducerBuilder>
            implements
                EndpointProducerBuilder {
        public FopProducerBuilder(String path) {
            super(path);
        }
    }

    public static enum FopOutputType {
        pdf, ps, pcl, png, jpeg, svg, xml, mif, rtf, txt;
    }
    public default FopProducerBuilder toFop(String path) {
        return new FopProducerBuilder(path);
    }
}