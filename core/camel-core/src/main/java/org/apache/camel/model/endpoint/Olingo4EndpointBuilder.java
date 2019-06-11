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

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.ExchangePattern;
import org.apache.camel.model.AbstractEndpointBuilder;
import org.apache.camel.model.EndpointConsumerBuilder;
import org.apache.camel.model.EndpointProducerBuilder;
import org.apache.camel.spi.ExceptionHandler;

/**
 * Communicates with OData 4.0 services using Apache Olingo OData API.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface Olingo4EndpointBuilder {


    public static class Olingo4CommonBuilder<T extends AbstractEndpointBuilder>
            extends
                AbstractEndpointBuilder<T> {
        Olingo4CommonBuilder(String path) {
            super("olingo4", path);
        }
        /**
         * What kind of operation to perform. The option is a
         * org.apache.camel.component.olingo4.internal.Olingo4ApiName type.
         */
        public T apiName(Olingo4ApiName apiName) {
            this.properties.put("apiName", apiName);
            return (T) this;
        }
        /**
         * What kind of operation to perform. The option will be converted to a
         * org.apache.camel.component.olingo4.internal.Olingo4ApiName type.
         */
        public T apiName(String apiName) {
            this.properties.put("apiName", apiName);
            return (T) this;
        }
        /**
         * What sub operation to use for the selected operation. The option is a
         * java.lang.String type.
         */
        public T methodName(String methodName) {
            this.properties.put("methodName", methodName);
            return (T) this;
        }
        /**
         * HTTP connection creation timeout in milliseconds, defaults to 30,000
         * (30 seconds). The option is a int type.
         */
        public T connectTimeout(int connectTimeout) {
            this.properties.put("connectTimeout", connectTimeout);
            return (T) this;
        }
        /**
         * HTTP connection creation timeout in milliseconds, defaults to 30,000
         * (30 seconds). The option will be converted to a int type.
         */
        public T connectTimeout(String connectTimeout) {
            this.properties.put("connectTimeout", connectTimeout);
            return (T) this;
        }
        /**
         * Content-Type header value can be used to specify JSON or XML message
         * format, defaults to application/json;charset=utf-8. The option is a
         * java.lang.String type.
         */
        public T contentType(String contentType) {
            this.properties.put("contentType", contentType);
            return (T) this;
        }
        /**
         * Set this to true to filter out results that have already been
         * communicated by this component. The option is a boolean type.
         */
        public T filterAlreadySeen(boolean filterAlreadySeen) {
            this.properties.put("filterAlreadySeen", filterAlreadySeen);
            return (T) this;
        }
        /**
         * Set this to true to filter out results that have already been
         * communicated by this component. The option will be converted to a
         * boolean type.
         */
        public T filterAlreadySeen(String filterAlreadySeen) {
            this.properties.put("filterAlreadySeen", filterAlreadySeen);
            return (T) this;
        }
        /**
         * Custom HTTP async client builder for more complex HTTP client
         * configuration, overrides connectionTimeout, socketTimeout, proxy and
         * sslContext. Note that a socketTimeout MUST be specified in the
         * builder, otherwise OData requests could block indefinitely. The
         * option is a org.apache.http.impl.nio.client.HttpAsyncClientBuilder
         * type.
         */
        public T httpAsyncClientBuilder(Object httpAsyncClientBuilder) {
            this.properties.put("httpAsyncClientBuilder", httpAsyncClientBuilder);
            return (T) this;
        }
        /**
         * Custom HTTP async client builder for more complex HTTP client
         * configuration, overrides connectionTimeout, socketTimeout, proxy and
         * sslContext. Note that a socketTimeout MUST be specified in the
         * builder, otherwise OData requests could block indefinitely. The
         * option will be converted to a
         * org.apache.http.impl.nio.client.HttpAsyncClientBuilder type.
         */
        public T httpAsyncClientBuilder(String httpAsyncClientBuilder) {
            this.properties.put("httpAsyncClientBuilder", httpAsyncClientBuilder);
            return (T) this;
        }
        /**
         * Custom HTTP client builder for more complex HTTP client
         * configuration, overrides connectionTimeout, socketTimeout, proxy and
         * sslContext. Note that a socketTimeout MUST be specified in the
         * builder, otherwise OData requests could block indefinitely. The
         * option is a org.apache.http.impl.client.HttpClientBuilder type.
         */
        public T httpClientBuilder(Object httpClientBuilder) {
            this.properties.put("httpClientBuilder", httpClientBuilder);
            return (T) this;
        }
        /**
         * Custom HTTP client builder for more complex HTTP client
         * configuration, overrides connectionTimeout, socketTimeout, proxy and
         * sslContext. Note that a socketTimeout MUST be specified in the
         * builder, otherwise OData requests could block indefinitely. The
         * option will be converted to a
         * org.apache.http.impl.client.HttpClientBuilder type.
         */
        public T httpClientBuilder(String httpClientBuilder) {
            this.properties.put("httpClientBuilder", httpClientBuilder);
            return (T) this;
        }
        /**
         * Custom HTTP headers to inject into every request, this could include
         * OAuth tokens, etc. The option is a
         * java.util.Map<java.lang.String,java.lang.String> type.
         */
        public T httpHeaders(Map<String, String> httpHeaders) {
            this.properties.put("httpHeaders", httpHeaders);
            return (T) this;
        }
        /**
         * Custom HTTP headers to inject into every request, this could include
         * OAuth tokens, etc. The option will be converted to a
         * java.util.Map<java.lang.String,java.lang.String> type.
         */
        public T httpHeaders(String httpHeaders) {
            this.properties.put("httpHeaders", httpHeaders);
            return (T) this;
        }
        /**
         * Sets the name of a parameter to be passed in the exchange In Body.
         * The option is a java.lang.String type.
         */
        public T inBody(String inBody) {
            this.properties.put("inBody", inBody);
            return (T) this;
        }
        /**
         * HTTP proxy server configuration. The option is a
         * org.apache.http.HttpHost type.
         */
        public T proxy(Object proxy) {
            this.properties.put("proxy", proxy);
            return (T) this;
        }
        /**
         * HTTP proxy server configuration. The option will be converted to a
         * org.apache.http.HttpHost type.
         */
        public T proxy(String proxy) {
            this.properties.put("proxy", proxy);
            return (T) this;
        }
        /**
         * Target OData service base URI, e.g.
         * http://services.odata.org/OData/OData.svc. The option is a
         * java.lang.String type.
         */
        public T serviceUri(String serviceUri) {
            this.properties.put("serviceUri", serviceUri);
            return (T) this;
        }
        /**
         * HTTP request timeout in milliseconds, defaults to 30,000 (30
         * seconds). The option is a int type.
         */
        public T socketTimeout(int socketTimeout) {
            this.properties.put("socketTimeout", socketTimeout);
            return (T) this;
        }
        /**
         * HTTP request timeout in milliseconds, defaults to 30,000 (30
         * seconds). The option will be converted to a int type.
         */
        public T socketTimeout(String socketTimeout) {
            this.properties.put("socketTimeout", socketTimeout);
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

    public static class Olingo4ConsumerBuilder
            extends
                Olingo4CommonBuilder<Olingo4ConsumerBuilder>
            implements
                EndpointConsumerBuilder {
        public Olingo4ConsumerBuilder(String path) {
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
        public Olingo4ConsumerBuilder bridgeErrorHandler(
                boolean bridgeErrorHandler) {
            this.properties.put("bridgeErrorHandler", bridgeErrorHandler);
            return (Olingo4ConsumerBuilder) this;
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
        public Olingo4ConsumerBuilder bridgeErrorHandler(
                String bridgeErrorHandler) {
            this.properties.put("bridgeErrorHandler", bridgeErrorHandler);
            return (Olingo4ConsumerBuilder) this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored. The option is a
         * org.apache.camel.spi.ExceptionHandler type.
         */
        public Olingo4ConsumerBuilder exceptionHandler(
                ExceptionHandler exceptionHandler) {
            this.properties.put("exceptionHandler", exceptionHandler);
            return (Olingo4ConsumerBuilder) this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored. The option will be
         * converted to a org.apache.camel.spi.ExceptionHandler type.
         */
        public Olingo4ConsumerBuilder exceptionHandler(String exceptionHandler) {
            this.properties.put("exceptionHandler", exceptionHandler);
            return (Olingo4ConsumerBuilder) this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange. The
         * option is a org.apache.camel.ExchangePattern type.
         */
        public Olingo4ConsumerBuilder exchangePattern(
                ExchangePattern exchangePattern) {
            this.properties.put("exchangePattern", exchangePattern);
            return (Olingo4ConsumerBuilder) this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange. The
         * option will be converted to a org.apache.camel.ExchangePattern type.
         */
        public Olingo4ConsumerBuilder exchangePattern(String exchangePattern) {
            this.properties.put("exchangePattern", exchangePattern);
            return (Olingo4ConsumerBuilder) this;
        }
    }

    public static class Olingo4ProducerBuilder
            extends
                Olingo4CommonBuilder<Olingo4ProducerBuilder>
            implements
                EndpointProducerBuilder {
        public Olingo4ProducerBuilder(String path) {
            super(path);
        }
    }

    public static enum Olingo4ApiName {
        DEFAULT;
    }
    public default Olingo4ConsumerBuilder fromOlingo4(String path) {
        return new Olingo4ConsumerBuilder(path);
    }
    public default Olingo4ProducerBuilder toOlingo4(String path) {
        return new Olingo4ProducerBuilder(path);
    }
}