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
 * The webhook component allows other Camel components that can receive push
 * notifications to expose webhook endpoints and automatically register them
 * with their own webhook provider.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface WebhookEndpointBuilder {


    public static class WebhookCommonBuilder<T extends AbstractEndpointBuilder>
            extends
                AbstractEndpointBuilder<T> {
        WebhookCommonBuilder(String path) {
            super("webhook", path);
        }
        /**
         * The delegate uri. Must belong to a component that supports webhooks.
         * The option is a java.lang.String type.
         */
        public T endpointUri(String endpointUri) {
            this.properties.put("endpointUri", endpointUri);
            return (T) this;
        }
        /**
         * Automatically register the webhook at startup and unregister it on
         * shutdown. The option is a boolean type.
         */
        public T webhookAutoRegister(boolean webhookAutoRegister) {
            this.properties.put("webhookAutoRegister", webhookAutoRegister);
            return (T) this;
        }
        /**
         * Automatically register the webhook at startup and unregister it on
         * shutdown. The option will be converted to a boolean type.
         */
        public T webhookAutoRegister(String webhookAutoRegister) {
            this.properties.put("webhookAutoRegister", webhookAutoRegister);
            return (T) this;
        }
        /**
         * The first (base) path element where the webhook will be exposed. It's
         * a good practice to set it to a random string, so that it cannot be
         * guessed by unauthorized parties. The option is a java.lang.String
         * type.
         */
        public T webhookBasePath(String webhookBasePath) {
            this.properties.put("webhookBasePath", webhookBasePath);
            return (T) this;
        }
        /**
         * The Camel Rest component to use for the REST transport, such as
         * netty4-http. The option is a java.lang.String type.
         */
        public T webhookComponentName(String webhookComponentName) {
            this.properties.put("webhookComponentName", webhookComponentName);
            return (T) this;
        }
        /**
         * The URL of the current service as seen by the webhook provider. The
         * option is a java.lang.String type.
         */
        public T webhookExternalUrl(String webhookExternalUrl) {
            this.properties.put("webhookExternalUrl", webhookExternalUrl);
            return (T) this;
        }
        /**
         * The path where the webhook endpoint will be exposed (relative to
         * basePath, if any). The option is a java.lang.String type.
         */
        public T webhookPath(String webhookPath) {
            this.properties.put("webhookPath", webhookPath);
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

    public static class WebhookConsumerBuilder
            extends
                WebhookCommonBuilder<WebhookConsumerBuilder>
            implements
                EndpointConsumerBuilder {
        public WebhookConsumerBuilder(String path) {
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
        public WebhookConsumerBuilder bridgeErrorHandler(
                boolean bridgeErrorHandler) {
            this.properties.put("bridgeErrorHandler", bridgeErrorHandler);
            return (WebhookConsumerBuilder) this;
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
        public WebhookConsumerBuilder bridgeErrorHandler(
                String bridgeErrorHandler) {
            this.properties.put("bridgeErrorHandler", bridgeErrorHandler);
            return (WebhookConsumerBuilder) this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored. The option is a
         * org.apache.camel.spi.ExceptionHandler type.
         */
        public WebhookConsumerBuilder exceptionHandler(
                ExceptionHandler exceptionHandler) {
            this.properties.put("exceptionHandler", exceptionHandler);
            return (WebhookConsumerBuilder) this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored. The option will be
         * converted to a org.apache.camel.spi.ExceptionHandler type.
         */
        public WebhookConsumerBuilder exceptionHandler(String exceptionHandler) {
            this.properties.put("exceptionHandler", exceptionHandler);
            return (WebhookConsumerBuilder) this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange. The
         * option is a org.apache.camel.ExchangePattern type.
         */
        public WebhookConsumerBuilder exchangePattern(
                ExchangePattern exchangePattern) {
            this.properties.put("exchangePattern", exchangePattern);
            return (WebhookConsumerBuilder) this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange. The
         * option will be converted to a org.apache.camel.ExchangePattern type.
         */
        public WebhookConsumerBuilder exchangePattern(String exchangePattern) {
            this.properties.put("exchangePattern", exchangePattern);
            return (WebhookConsumerBuilder) this;
        }
    }
    public default WebhookConsumerBuilder fromWebhook(String path) {
        return new WebhookConsumerBuilder(path);
    }
}