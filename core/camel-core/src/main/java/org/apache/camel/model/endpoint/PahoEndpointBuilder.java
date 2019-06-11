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
import org.apache.camel.ExchangePattern;
import org.apache.camel.model.AbstractEndpointBuilder;
import org.apache.camel.model.EndpointConsumerBuilder;
import org.apache.camel.model.EndpointProducerBuilder;
import org.apache.camel.spi.ExceptionHandler;

/**
 * Component for communicating with MQTT M2M message brokers using Eclipse Paho
 * MQTT Client.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface PahoEndpointBuilder {


    public static class PahoCommonBuilder<T extends AbstractEndpointBuilder>
            extends
                AbstractEndpointBuilder<T> {
        PahoCommonBuilder(String path) {
            super("paho", path);
        }
        /**
         * Name of the topic. The option is a java.lang.String type.
         */
        public T topic(String topic) {
            this.properties.put("topic", topic);
            return (T) this;
        }
        /**
         * Client will automatically attempt to reconnect to the server if the
         * connection is lost. The option is a boolean type.
         */
        public T autoReconnect(boolean autoReconnect) {
            this.properties.put("autoReconnect", autoReconnect);
            return (T) this;
        }
        /**
         * Client will automatically attempt to reconnect to the server if the
         * connection is lost. The option will be converted to a boolean type.
         */
        public T autoReconnect(String autoReconnect) {
            this.properties.put("autoReconnect", autoReconnect);
            return (T) this;
        }
        /**
         * The URL of the MQTT broker. The option is a java.lang.String type.
         */
        public T brokerUrl(String brokerUrl) {
            this.properties.put("brokerUrl", brokerUrl);
            return (T) this;
        }
        /**
         * MQTT client identifier. The option is a java.lang.String type.
         */
        public T clientId(String clientId) {
            this.properties.put("clientId", clientId);
            return (T) this;
        }
        /**
         * Client connection options. The option is a
         * org.eclipse.paho.client.mqttv3.MqttConnectOptions type.
         */
        public T connectOptions(Object connectOptions) {
            this.properties.put("connectOptions", connectOptions);
            return (T) this;
        }
        /**
         * Client connection options. The option will be converted to a
         * org.eclipse.paho.client.mqttv3.MqttConnectOptions type.
         */
        public T connectOptions(String connectOptions) {
            this.properties.put("connectOptions", connectOptions);
            return (T) this;
        }
        /**
         * Base directory used by the file persistence provider. The option is a
         * java.lang.String type.
         */
        public T filePersistenceDirectory(String filePersistenceDirectory) {
            this.properties.put("filePersistenceDirectory", filePersistenceDirectory);
            return (T) this;
        }
        /**
         * Password to be used for authentication against the MQTT broker. The
         * option is a java.lang.String type.
         */
        public T password(String password) {
            this.properties.put("password", password);
            return (T) this;
        }
        /**
         * Client persistence to be used - memory or file. The option is a
         * org.apache.camel.component.paho.PahoPersistence type.
         */
        public T persistence(PahoPersistence persistence) {
            this.properties.put("persistence", persistence);
            return (T) this;
        }
        /**
         * Client persistence to be used - memory or file. The option will be
         * converted to a org.apache.camel.component.paho.PahoPersistence type.
         */
        public T persistence(String persistence) {
            this.properties.put("persistence", persistence);
            return (T) this;
        }
        /**
         * Client quality of service level (0-2). The option is a int type.
         */
        public T qos(int qos) {
            this.properties.put("qos", qos);
            return (T) this;
        }
        /**
         * Client quality of service level (0-2). The option will be converted
         * to a int type.
         */
        public T qos(String qos) {
            this.properties.put("qos", qos);
            return (T) this;
        }
        /**
         * Define if you don't want to resolve the MQTT Connect Options from
         * registry. The option is a boolean type.
         */
        public T resolveMqttConnectOptions(boolean resolveMqttConnectOptions) {
            this.properties.put("resolveMqttConnectOptions", resolveMqttConnectOptions);
            return (T) this;
        }
        /**
         * Define if you don't want to resolve the MQTT Connect Options from
         * registry. The option will be converted to a boolean type.
         */
        public T resolveMqttConnectOptions(String resolveMqttConnectOptions) {
            this.properties.put("resolveMqttConnectOptions", resolveMqttConnectOptions);
            return (T) this;
        }
        /**
         * Retain option. The option is a boolean type.
         */
        public T retained(boolean retained) {
            this.properties.put("retained", retained);
            return (T) this;
        }
        /**
         * Retain option. The option will be converted to a boolean type.
         */
        public T retained(String retained) {
            this.properties.put("retained", retained);
            return (T) this;
        }
        /**
         * Username to be used for authentication against the MQTT broker. The
         * option is a java.lang.String type.
         */
        public T userName(String userName) {
            this.properties.put("userName", userName);
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

    public static class PahoConsumerBuilder
            extends
                PahoCommonBuilder<PahoConsumerBuilder>
            implements
                EndpointConsumerBuilder {
        public PahoConsumerBuilder(String path) {
            super(path);
        }
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions occurred while the consumer is trying to
         * pickup incoming messages, or the likes, will now be processed as a
         * message and handled by the routing Error Handler. By default the
         * consumer will use the org.apache.camel.spi.ExceptionHandler to deal
         * with exceptions, that will be logged at WARN or ERROR level and
         * ignored. The option is a boolean type.
         */
        public PahoConsumerBuilder bridgeErrorHandler(boolean bridgeErrorHandler) {
            this.properties.put("bridgeErrorHandler", bridgeErrorHandler);
            return (PahoConsumerBuilder) this;
        }
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions occurred while the consumer is trying to
         * pickup incoming messages, or the likes, will now be processed as a
         * message and handled by the routing Error Handler. By default the
         * consumer will use the org.apache.camel.spi.ExceptionHandler to deal
         * with exceptions, that will be logged at WARN or ERROR level and
         * ignored. The option will be converted to a boolean type.
         */
        public PahoConsumerBuilder bridgeErrorHandler(String bridgeErrorHandler) {
            this.properties.put("bridgeErrorHandler", bridgeErrorHandler);
            return (PahoConsumerBuilder) this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored. The option is a
         * org.apache.camel.spi.ExceptionHandler type.
         */
        public PahoConsumerBuilder exceptionHandler(
                ExceptionHandler exceptionHandler) {
            this.properties.put("exceptionHandler", exceptionHandler);
            return (PahoConsumerBuilder) this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored. The option will be
         * converted to a org.apache.camel.spi.ExceptionHandler type.
         */
        public PahoConsumerBuilder exceptionHandler(String exceptionHandler) {
            this.properties.put("exceptionHandler", exceptionHandler);
            return (PahoConsumerBuilder) this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange. The
         * option is a org.apache.camel.ExchangePattern type.
         */
        public PahoConsumerBuilder exchangePattern(
                ExchangePattern exchangePattern) {
            this.properties.put("exchangePattern", exchangePattern);
            return (PahoConsumerBuilder) this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange. The
         * option will be converted to a org.apache.camel.ExchangePattern type.
         */
        public PahoConsumerBuilder exchangePattern(String exchangePattern) {
            this.properties.put("exchangePattern", exchangePattern);
            return (PahoConsumerBuilder) this;
        }
    }

    public static class PahoProducerBuilder
            extends
                PahoCommonBuilder<PahoProducerBuilder>
            implements
                EndpointProducerBuilder {
        public PahoProducerBuilder(String path) {
            super(path);
        }
    }

    public static enum PahoPersistence {
        FILE, MEMORY;
    }
    public default PahoConsumerBuilder fromPaho(String path) {
        return new PahoConsumerBuilder(path);
    }
    public default PahoProducerBuilder toPaho(String path) {
        return new PahoProducerBuilder(path);
    }
}