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
 * The jcr component allows you to add/read nodes to/from a JCR compliant
 * content repository.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface JcrEndpointBuilder {


    public static class JcrCommonBuilder<T extends AbstractEndpointBuilder>
            extends
                AbstractEndpointBuilder<T> {
        JcrCommonBuilder(String path) {
            super("jcr", path);
        }
        /**
         * Name of the javax.jcr.Repository to lookup from the Camel registry to
         * be used. The option is a java.lang.String type.
         */
        public T host(String host) {
            this.properties.put("host", host);
            return (T) this;
        }
        /**
         * Get the base node when accessing the repository. The option is a
         * java.lang.String type.
         */
        public T base(String base) {
            this.properties.put("base", base);
            return (T) this;
        }
        /**
         * When isDeep is true, events whose associated parent node is at
         * absPath or within its subgraph are received. The option is a boolean
         * type.
         */
        public T deep(boolean deep) {
            this.properties.put("deep", deep);
            return (T) this;
        }
        /**
         * When isDeep is true, events whose associated parent node is at
         * absPath or within its subgraph are received. The option will be
         * converted to a boolean type.
         */
        public T deep(String deep) {
            this.properties.put("deep", deep);
            return (T) this;
        }
        /**
         * eventTypes (a combination of one or more event types encoded as a bit
         * mask value such as javax.jcr.observation.Event.NODE_ADDED,
         * javax.jcr.observation.Event.NODE_REMOVED, etc.). The option is a int
         * type.
         */
        public T eventTypes(int eventTypes) {
            this.properties.put("eventTypes", eventTypes);
            return (T) this;
        }
        /**
         * eventTypes (a combination of one or more event types encoded as a bit
         * mask value such as javax.jcr.observation.Event.NODE_ADDED,
         * javax.jcr.observation.Event.NODE_REMOVED, etc.). The option will be
         * converted to a int type.
         */
        public T eventTypes(String eventTypes) {
            this.properties.put("eventTypes", eventTypes);
            return (T) this;
        }
        /**
         * When a comma separated nodeTypeName list string is set, only events
         * whose associated parent node has one of the node types (or a subtype
         * of one of the node types) in this list will be received. The option
         * is a java.lang.String type.
         */
        public T nodeTypeNames(String nodeTypeNames) {
            this.properties.put("nodeTypeNames", nodeTypeNames);
            return (T) this;
        }
        /**
         * If noLocal is true, then events generated by the session through
         * which the listener was registered are ignored. Otherwise, they are
         * not ignored. The option is a boolean type.
         */
        public T noLocal(boolean noLocal) {
            this.properties.put("noLocal", noLocal);
            return (T) this;
        }
        /**
         * If noLocal is true, then events generated by the session through
         * which the listener was registered are ignored. Otherwise, they are
         * not ignored. The option will be converted to a boolean type.
         */
        public T noLocal(String noLocal) {
            this.properties.put("noLocal", noLocal);
            return (T) this;
        }
        /**
         * Password for login. The option is a java.lang.String type.
         */
        public T password(String password) {
            this.properties.put("password", password);
            return (T) this;
        }
        /**
         * Interval in milliseconds to wait before each session live checking
         * The default value is 60000 ms. The option is a long type.
         */
        public T sessionLiveCheckInterval(long sessionLiveCheckInterval) {
            this.properties.put("sessionLiveCheckInterval", sessionLiveCheckInterval);
            return (T) this;
        }
        /**
         * Interval in milliseconds to wait before each session live checking
         * The default value is 60000 ms. The option will be converted to a long
         * type.
         */
        public T sessionLiveCheckInterval(String sessionLiveCheckInterval) {
            this.properties.put("sessionLiveCheckInterval", sessionLiveCheckInterval);
            return (T) this;
        }
        /**
         * Interval in milliseconds to wait before the first session live
         * checking. The default value is 3000 ms. The option is a long type.
         */
        public T sessionLiveCheckIntervalOnStart(
                long sessionLiveCheckIntervalOnStart) {
            this.properties.put("sessionLiveCheckIntervalOnStart", sessionLiveCheckIntervalOnStart);
            return (T) this;
        }
        /**
         * Interval in milliseconds to wait before the first session live
         * checking. The default value is 3000 ms. The option will be converted
         * to a long type.
         */
        public T sessionLiveCheckIntervalOnStart(
                String sessionLiveCheckIntervalOnStart) {
            this.properties.put("sessionLiveCheckIntervalOnStart", sessionLiveCheckIntervalOnStart);
            return (T) this;
        }
        /**
         * Username for login. The option is a java.lang.String type.
         */
        public T username(String username) {
            this.properties.put("username", username);
            return (T) this;
        }
        /**
         * When a comma separated uuid list string is set, only events whose
         * associated parent node has one of the identifiers in the comma
         * separated uuid list will be received. The option is a
         * java.lang.String type.
         */
        public T uuids(String uuids) {
            this.properties.put("uuids", uuids);
            return (T) this;
        }
        /**
         * The workspace to access. If it's not specified then the default one
         * will be used. The option is a java.lang.String type.
         */
        public T workspaceName(String workspaceName) {
            this.properties.put("workspaceName", workspaceName);
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

    public static class JcrConsumerBuilder
            extends
                JcrCommonBuilder<JcrConsumerBuilder>
            implements
                EndpointConsumerBuilder {
        public JcrConsumerBuilder(String path) {
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
        public JcrConsumerBuilder bridgeErrorHandler(boolean bridgeErrorHandler) {
            this.properties.put("bridgeErrorHandler", bridgeErrorHandler);
            return (JcrConsumerBuilder) this;
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
        public JcrConsumerBuilder bridgeErrorHandler(String bridgeErrorHandler) {
            this.properties.put("bridgeErrorHandler", bridgeErrorHandler);
            return (JcrConsumerBuilder) this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored. The option is a
         * org.apache.camel.spi.ExceptionHandler type.
         */
        public JcrConsumerBuilder exceptionHandler(
                ExceptionHandler exceptionHandler) {
            this.properties.put("exceptionHandler", exceptionHandler);
            return (JcrConsumerBuilder) this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored. The option will be
         * converted to a org.apache.camel.spi.ExceptionHandler type.
         */
        public JcrConsumerBuilder exceptionHandler(String exceptionHandler) {
            this.properties.put("exceptionHandler", exceptionHandler);
            return (JcrConsumerBuilder) this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange. The
         * option is a org.apache.camel.ExchangePattern type.
         */
        public JcrConsumerBuilder exchangePattern(
                ExchangePattern exchangePattern) {
            this.properties.put("exchangePattern", exchangePattern);
            return (JcrConsumerBuilder) this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange. The
         * option will be converted to a org.apache.camel.ExchangePattern type.
         */
        public JcrConsumerBuilder exchangePattern(String exchangePattern) {
            this.properties.put("exchangePattern", exchangePattern);
            return (JcrConsumerBuilder) this;
        }
    }

    public static class JcrProducerBuilder
            extends
                JcrCommonBuilder<JcrProducerBuilder>
            implements
                EndpointProducerBuilder {
        public JcrProducerBuilder(String path) {
            super(path);
        }
    }
    public default JcrConsumerBuilder fromJcr(String path) {
        return new JcrConsumerBuilder(path);
    }
    public default JcrProducerBuilder toJcr(String path) {
        return new JcrProducerBuilder(path);
    }
}