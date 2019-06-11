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
 * The influxdb component allows you to interact with InfluxDB, a time series
 * database.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface InfluxDbEndpointBuilder {


    public static class InfluxDbCommonBuilder<T extends AbstractEndpointBuilder>
            extends
                AbstractEndpointBuilder<T> {
        InfluxDbCommonBuilder(String path) {
            super("influxdb", path);
        }
        /**
         * Connection to the influx database, of class InfluxDB.class. The
         * option is a java.lang.String type.
         */
        public T connectionBean(String connectionBean) {
            this.properties.put("connectionBean", connectionBean);
            return (T) this;
        }
        /**
         * Define if this operation is a batch operation or not. The option is a
         * boolean type.
         */
        public T batch(boolean batch) {
            this.properties.put("batch", batch);
            return (T) this;
        }
        /**
         * Define if this operation is a batch operation or not. The option will
         * be converted to a boolean type.
         */
        public T batch(String batch) {
            this.properties.put("batch", batch);
            return (T) this;
        }
        /**
         * The name of the database where the time series will be stored. The
         * option is a java.lang.String type.
         */
        public T databaseName(String databaseName) {
            this.properties.put("databaseName", databaseName);
            return (T) this;
        }
        /**
         * Define if this operation is an insert or a query. The option is a
         * java.lang.String type.
         */
        public T operation(String operation) {
            this.properties.put("operation", operation);
            return (T) this;
        }
        /**
         * Define the query in case of operation query. The option is a
         * java.lang.String type.
         */
        public T query(String query) {
            this.properties.put("query", query);
            return (T) this;
        }
        /**
         * The string that defines the retention policy to the data created by
         * the endpoint. The option is a java.lang.String type.
         */
        public T retentionPolicy(String retentionPolicy) {
            this.properties.put("retentionPolicy", retentionPolicy);
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

    public static class InfluxDbProducerBuilder
            extends
                InfluxDbCommonBuilder<InfluxDbProducerBuilder>
            implements
                EndpointProducerBuilder {
        public InfluxDbProducerBuilder(String path) {
            super(path);
        }
    }
    public default InfluxDbProducerBuilder toInfluxDb(String path) {
        return new InfluxDbProducerBuilder(path);
    }
}