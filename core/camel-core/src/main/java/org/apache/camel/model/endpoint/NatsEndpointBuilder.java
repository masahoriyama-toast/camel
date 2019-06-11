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
 * The nats component allows you produce and consume messages from NATS.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface NatsEndpointBuilder {


    public static class NatsCommonBuilder<T extends AbstractEndpointBuilder>
            extends
                AbstractEndpointBuilder<T> {
        NatsCommonBuilder(String path) {
            super("nats", path);
        }
        /**
         * URLs to one or more NAT servers. Use comma to separate URLs when
         * specifying multiple servers. The option is a java.lang.String type.
         */
        public T servers(String servers) {
            this.properties.put("servers", servers);
            return (T) this;
        }
        /**
         * Reference an already instantiated connection to Nats server. The
         * option is a io.nats.client.Connection type.
         */
        public T connection(Object connection) {
            this.properties.put("connection", connection);
            return (T) this;
        }
        /**
         * Reference an already instantiated connection to Nats server. The
         * option will be converted to a io.nats.client.Connection type.
         */
        public T connection(String connection) {
            this.properties.put("connection", connection);
            return (T) this;
        }
        /**
         * Timeout for connection attempts. (in milliseconds). The option is a
         * int type.
         */
        public T connectionTimeout(int connectionTimeout) {
            this.properties.put("connectionTimeout", connectionTimeout);
            return (T) this;
        }
        /**
         * Timeout for connection attempts. (in milliseconds). The option will
         * be converted to a int type.
         */
        public T connectionTimeout(String connectionTimeout) {
            this.properties.put("connectionTimeout", connectionTimeout);
            return (T) this;
        }
        /**
         * Define if we want to flush connection or not. The option is a boolean
         * type.
         */
        public T flushConnection(boolean flushConnection) {
            this.properties.put("flushConnection", flushConnection);
            return (T) this;
        }
        /**
         * Define if we want to flush connection or not. The option will be
         * converted to a boolean type.
         */
        public T flushConnection(String flushConnection) {
            this.properties.put("flushConnection", flushConnection);
            return (T) this;
        }
        /**
         * Set the flush timeout (in milliseconds). The option is a int type.
         */
        public T flushTimeout(int flushTimeout) {
            this.properties.put("flushTimeout", flushTimeout);
            return (T) this;
        }
        /**
         * Set the flush timeout (in milliseconds). The option will be converted
         * to a int type.
         */
        public T flushTimeout(String flushTimeout) {
            this.properties.put("flushTimeout", flushTimeout);
            return (T) this;
        }
        /**
         * maximum number of pings have not received a response allowed by the
         * client. The option is a int type.
         */
        public T maxPingsOut(int maxPingsOut) {
            this.properties.put("maxPingsOut", maxPingsOut);
            return (T) this;
        }
        /**
         * maximum number of pings have not received a response allowed by the
         * client. The option will be converted to a int type.
         */
        public T maxPingsOut(String maxPingsOut) {
            this.properties.put("maxPingsOut", maxPingsOut);
            return (T) this;
        }
        /**
         * Max reconnection attempts. The option is a int type.
         */
        public T maxReconnectAttempts(int maxReconnectAttempts) {
            this.properties.put("maxReconnectAttempts", maxReconnectAttempts);
            return (T) this;
        }
        /**
         * Max reconnection attempts. The option will be converted to a int
         * type.
         */
        public T maxReconnectAttempts(String maxReconnectAttempts) {
            this.properties.put("maxReconnectAttempts", maxReconnectAttempts);
            return (T) this;
        }
        /**
         * Turn off echo. If supported by the gnatsd version you are connecting
         * to this flag will prevent the server from echoing messages back to
         * the connection if it has subscriptions on the subject being published
         * to. The option is a boolean type.
         */
        public T noEcho(boolean noEcho) {
            this.properties.put("noEcho", noEcho);
            return (T) this;
        }
        /**
         * Turn off echo. If supported by the gnatsd version you are connecting
         * to this flag will prevent the server from echoing messages back to
         * the connection if it has subscriptions on the subject being published
         * to. The option will be converted to a boolean type.
         */
        public T noEcho(String noEcho) {
            this.properties.put("noEcho", noEcho);
            return (T) this;
        }
        /**
         * Whether or not randomizing the order of servers for the connection
         * attempts. The option is a boolean type.
         */
        public T noRandomizeServers(boolean noRandomizeServers) {
            this.properties.put("noRandomizeServers", noRandomizeServers);
            return (T) this;
        }
        /**
         * Whether or not randomizing the order of servers for the connection
         * attempts. The option will be converted to a boolean type.
         */
        public T noRandomizeServers(String noRandomizeServers) {
            this.properties.put("noRandomizeServers", noRandomizeServers);
            return (T) this;
        }
        /**
         * Whether or not running in pedantic mode (this affects performace).
         * The option is a boolean type.
         */
        public T pedantic(boolean pedantic) {
            this.properties.put("pedantic", pedantic);
            return (T) this;
        }
        /**
         * Whether or not running in pedantic mode (this affects performace).
         * The option will be converted to a boolean type.
         */
        public T pedantic(String pedantic) {
            this.properties.put("pedantic", pedantic);
            return (T) this;
        }
        /**
         * Ping interval to be aware if connection is still alive (in
         * milliseconds). The option is a int type.
         */
        public T pingInterval(int pingInterval) {
            this.properties.put("pingInterval", pingInterval);
            return (T) this;
        }
        /**
         * Ping interval to be aware if connection is still alive (in
         * milliseconds). The option will be converted to a int type.
         */
        public T pingInterval(String pingInterval) {
            this.properties.put("pingInterval", pingInterval);
            return (T) this;
        }
        /**
         * Whether or not using reconnection feature. The option is a boolean
         * type.
         */
        public T reconnect(boolean reconnect) {
            this.properties.put("reconnect", reconnect);
            return (T) this;
        }
        /**
         * Whether or not using reconnection feature. The option will be
         * converted to a boolean type.
         */
        public T reconnect(String reconnect) {
            this.properties.put("reconnect", reconnect);
            return (T) this;
        }
        /**
         * Waiting time before attempts reconnection (in milliseconds). The
         * option is a int type.
         */
        public T reconnectTimeWait(int reconnectTimeWait) {
            this.properties.put("reconnectTimeWait", reconnectTimeWait);
            return (T) this;
        }
        /**
         * Waiting time before attempts reconnection (in milliseconds). The
         * option will be converted to a int type.
         */
        public T reconnectTimeWait(String reconnectTimeWait) {
            this.properties.put("reconnectTimeWait", reconnectTimeWait);
            return (T) this;
        }
        /**
         * Interval to clean up cancelled/timed out requests. The option is a
         * int type.
         */
        public T requestCleanupInterval(int requestCleanupInterval) {
            this.properties.put("requestCleanupInterval", requestCleanupInterval);
            return (T) this;
        }
        /**
         * Interval to clean up cancelled/timed out requests. The option will be
         * converted to a int type.
         */
        public T requestCleanupInterval(String requestCleanupInterval) {
            this.properties.put("requestCleanupInterval", requestCleanupInterval);
            return (T) this;
        }
        /**
         * The name of topic we want to use. The option is a java.lang.String
         * type.
         */
        public T topic(String topic) {
            this.properties.put("topic", topic);
            return (T) this;
        }
        /**
         * Whether or not running in verbose mode. The option is a boolean type.
         */
        public T verbose(boolean verbose) {
            this.properties.put("verbose", verbose);
            return (T) this;
        }
        /**
         * Whether or not running in verbose mode. The option will be converted
         * to a boolean type.
         */
        public T verbose(String verbose) {
            this.properties.put("verbose", verbose);
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
        /**
         * Set secure option indicating TLS is required. The option is a boolean
         * type.
         */
        public T secure(boolean secure) {
            this.properties.put("secure", secure);
            return (T) this;
        }
        /**
         * Set secure option indicating TLS is required. The option will be
         * converted to a boolean type.
         */
        public T secure(String secure) {
            this.properties.put("secure", secure);
            return (T) this;
        }
        /**
         * To configure security using SSLContextParameters. The option is a
         * org.apache.camel.support.jsse.SSLContextParameters type.
         */
        public T sslContextParameters(Object sslContextParameters) {
            this.properties.put("sslContextParameters", sslContextParameters);
            return (T) this;
        }
        /**
         * To configure security using SSLContextParameters. The option will be
         * converted to a org.apache.camel.support.jsse.SSLContextParameters
         * type.
         */
        public T sslContextParameters(String sslContextParameters) {
            this.properties.put("sslContextParameters", sslContextParameters);
            return (T) this;
        }
    }

    public static class NatsConsumerBuilder
            extends
                NatsCommonBuilder<NatsConsumerBuilder>
            implements
                EndpointConsumerBuilder {
        public NatsConsumerBuilder(String path) {
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
        public NatsConsumerBuilder bridgeErrorHandler(boolean bridgeErrorHandler) {
            this.properties.put("bridgeErrorHandler", bridgeErrorHandler);
            return (NatsConsumerBuilder) this;
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
        public NatsConsumerBuilder bridgeErrorHandler(String bridgeErrorHandler) {
            this.properties.put("bridgeErrorHandler", bridgeErrorHandler);
            return (NatsConsumerBuilder) this;
        }
        /**
         * Stop receiving messages from a topic we are subscribing to after
         * maxMessages. The option is a java.lang.String type.
         */
        public NatsConsumerBuilder maxMessages(String maxMessages) {
            this.properties.put("maxMessages", maxMessages);
            return (NatsConsumerBuilder) this;
        }
        /**
         * Consumer pool size. The option is a int type.
         */
        public NatsConsumerBuilder poolSize(int poolSize) {
            this.properties.put("poolSize", poolSize);
            return (NatsConsumerBuilder) this;
        }
        /**
         * Consumer pool size. The option will be converted to a int type.
         */
        public NatsConsumerBuilder poolSize(String poolSize) {
            this.properties.put("poolSize", poolSize);
            return (NatsConsumerBuilder) this;
        }
        /**
         * The Queue name if we are using nats for a queue configuration. The
         * option is a java.lang.String type.
         */
        public NatsConsumerBuilder queueName(String queueName) {
            this.properties.put("queueName", queueName);
            return (NatsConsumerBuilder) this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored. The option is a
         * org.apache.camel.spi.ExceptionHandler type.
         */
        public NatsConsumerBuilder exceptionHandler(
                ExceptionHandler exceptionHandler) {
            this.properties.put("exceptionHandler", exceptionHandler);
            return (NatsConsumerBuilder) this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored. The option will be
         * converted to a org.apache.camel.spi.ExceptionHandler type.
         */
        public NatsConsumerBuilder exceptionHandler(String exceptionHandler) {
            this.properties.put("exceptionHandler", exceptionHandler);
            return (NatsConsumerBuilder) this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange. The
         * option is a org.apache.camel.ExchangePattern type.
         */
        public NatsConsumerBuilder exchangePattern(
                ExchangePattern exchangePattern) {
            this.properties.put("exchangePattern", exchangePattern);
            return (NatsConsumerBuilder) this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange. The
         * option will be converted to a org.apache.camel.ExchangePattern type.
         */
        public NatsConsumerBuilder exchangePattern(String exchangePattern) {
            this.properties.put("exchangePattern", exchangePattern);
            return (NatsConsumerBuilder) this;
        }
    }

    public static class NatsProducerBuilder
            extends
                NatsCommonBuilder<NatsProducerBuilder>
            implements
                EndpointProducerBuilder {
        public NatsProducerBuilder(String path) {
            super(path);
        }
        /**
         * the subject to which subscribers should send response. The option is
         * a java.lang.String type.
         */
        public NatsProducerBuilder replySubject(String replySubject) {
            this.properties.put("replySubject", replySubject);
            return (NatsProducerBuilder) this;
        }
    }
    public default NatsConsumerBuilder fromNats(String path) {
        return new NatsConsumerBuilder(path);
    }
    public default NatsProducerBuilder toNats(String path) {
        return new NatsProducerBuilder(path);
    }
}