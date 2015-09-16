package com.intercom.web.smtcollector.domain;

import java.io.Serializable;

public interface SmtValueObject<ValueObjectT extends SmtValueObject> extends Serializable {

	public boolean sameValueAs(ValueObjectT other);

}
