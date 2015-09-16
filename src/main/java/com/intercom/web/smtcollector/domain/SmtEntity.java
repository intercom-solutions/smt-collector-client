package com.intercom.web.smtcollector.domain;

import java.io.Serializable;

public interface SmtEntity<EntityT extends SmtEntity> extends Serializable {

	public boolean sameIdentityAs(EntityT other);

}
