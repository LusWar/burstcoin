package brs.util.logging

import org.slf4j.Logger
import kotlin.contracts.InvocationKind
import kotlin.contracts.contract

typealias LogMessageProducer = () -> String
typealias NullableLogMessageProducer = () -> String?

inline fun Logger.safeTrace(messageProducer: LogMessageProducer) {
    contract { callsInPlace(messageProducer, InvocationKind.AT_MOST_ONCE) }
    if (this.isTraceEnabled) {
        this.trace(messageProducer())
    }
}

inline fun Logger.safeTrace(t: Throwable, messageProducer: NullableLogMessageProducer) {
    contract { callsInPlace(messageProducer, InvocationKind.AT_MOST_ONCE) }
    if (this.isTraceEnabled) {
        this.trace(messageProducer(), t)
    }
}

inline fun Logger.safeDebug(messageProducer: LogMessageProducer) {
    contract { callsInPlace(messageProducer, InvocationKind.AT_MOST_ONCE) }
    if (this.isDebugEnabled) {
        this.debug(messageProducer())
    }
}

inline fun Logger.safeDebug(t: Throwable, messageProducer: NullableLogMessageProducer) {
    contract { callsInPlace(messageProducer, InvocationKind.AT_MOST_ONCE) }
    if (this.isDebugEnabled) {
        this.debug(messageProducer(), t)
    }
}

inline fun Logger.safeInfo(messageProducer: LogMessageProducer) {
    contract { callsInPlace(messageProducer, InvocationKind.AT_MOST_ONCE) }
    if (this.isInfoEnabled) {
        this.info(messageProducer())
    }
}

inline fun Logger.safeInfo(t: Throwable, messageProducer: NullableLogMessageProducer) {
    contract { callsInPlace(messageProducer, InvocationKind.AT_MOST_ONCE) }
    if (this.isInfoEnabled) {
        this.info(messageProducer(), t)
    }
}

inline fun Logger.safeWarn(messageProducer: LogMessageProducer) {
    contract { callsInPlace(messageProducer, InvocationKind.AT_MOST_ONCE) }
    if (this.isWarnEnabled) {
        this.warn(messageProducer())
    }
}

inline fun Logger.safeWarn(t: Throwable, messageProducer: NullableLogMessageProducer) {
    contract { callsInPlace(messageProducer, InvocationKind.AT_MOST_ONCE) }
    if (this.isWarnEnabled) {
        this.warn(messageProducer(), t)
    }
}

inline fun Logger.safeError(messageProducer: LogMessageProducer) {
    contract { callsInPlace(messageProducer, InvocationKind.AT_MOST_ONCE) }
    if (this.isErrorEnabled) {
        this.error(messageProducer())
    }
}

inline fun Logger.safeError(t: Throwable, messageProducer: NullableLogMessageProducer) {
    contract { callsInPlace(messageProducer, InvocationKind.AT_MOST_ONCE) }
    if (this.isErrorEnabled) {
        this.error(messageProducer(), t)
    }
}
