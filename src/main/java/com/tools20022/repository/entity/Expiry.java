/* Tools20022 - API for ISO 20022
* Copyright (C) 2017 Tools20022.com - László Bukodi 
* 
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
* 
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
* 
* You should have received a copy of the GNU General Public License
* along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package com.tools20022.repository.entity;

import com.tools20022.metamodel.*;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max2000Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.Location;
import com.tools20022.repository.entity.Undertaking;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;

/**
 * Expiry parameters.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Expiry" src="doc-files/Expiry.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Expiry#mmExpiryDateTime
 * Expiry.mmExpiryDateTime}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Expiry#mmUndertaking
 * Expiry.mmUndertaking}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Expiry#mmExpiryCondition
 * Expiry.mmExpiryCondition}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Expiry#mmOpenEndedIndicator
 * Expiry.mmOpenEndedIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Expiry#mmExpiryPlace
 * Expiry.mmExpiryPlace}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Location#mmRelatedExpiry
 * Location.mmRelatedExpiry}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Undertaking#mmExpiry
 * Undertaking.mmExpiry}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Expiry"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Expiry parameters."</li>
 * </ul>
 */
public class Expiry {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected ISODateTime expiryDateTime;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Expiry
	 * Expiry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExpiryDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time when the expiry of the undertaking takes effect."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Expiry, ISODateTime> mmExpiryDateTime = new MMBusinessAttribute<Expiry, ISODateTime>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Expiry.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ExpiryDateTime";
			definition = "Date and time when the expiry of the undertaking takes effect.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(Expiry obj) {
			return obj.getExpiryDateTime();
		}

		@Override
		public void setValue(Expiry obj, ISODateTime value) {
			obj.setExpiryDateTime(value);
		}
	};
	protected Undertaking undertaking;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Undertaking#mmExpiry
	 * Undertaking.mmExpiry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Undertaking
	 * Undertaking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Expiry
	 * Expiry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Undertaking"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Undertaking for which expiry information is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Expiry, Undertaking> mmUndertaking = new MMBusinessAssociationEnd<Expiry, Undertaking>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Expiry.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Undertaking";
			definition = "Undertaking for which expiry information is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Undertaking.mmExpiry;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Undertaking.mmObject();
		}

		@Override
		public Undertaking getValue(Expiry obj) {
			return obj.getUndertaking();
		}

		@Override
		public void setValue(Expiry obj, Undertaking value) {
			obj.setUndertaking(value);
		}
	};
	protected Max2000Text expiryCondition;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max2000Text
	 * Max2000Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Expiry
	 * Expiry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExpiryCondition"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Condition that indicates when the undertaking will cease to be available at the place for presentation. "
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Expiry, Max2000Text> mmExpiryCondition = new MMBusinessAttribute<Expiry, Max2000Text>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Expiry.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ExpiryCondition";
			definition = "Condition that indicates when the undertaking will cease to be available at the place for presentation. ";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max2000Text.mmObject();
		}

		@Override
		public Max2000Text getValue(Expiry obj) {
			return obj.getExpiryCondition();
		}

		@Override
		public void setValue(Expiry obj, Max2000Text value) {
			obj.setExpiryCondition(value);
		}
	};
	protected YesNoIndicator openEndedIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Expiry
	 * Expiry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OpenEndedIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies whether the expiry period is open ended."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Expiry, YesNoIndicator> mmOpenEndedIndicator = new MMBusinessAttribute<Expiry, YesNoIndicator>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Expiry.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OpenEndedIndicator";
			definition = "Specifies whether the expiry period is open ended.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(Expiry obj) {
			return obj.getOpenEndedIndicator();
		}

		@Override
		public void setValue(Expiry obj, YesNoIndicator value) {
			obj.setOpenEndedIndicator(value);
		}
	};
	protected Location expiryPlace;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Location#mmRelatedExpiry
	 * Location.mmRelatedExpiry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Location Location}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Expiry
	 * Expiry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExpiryPlace"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Place where the expiry of the undertaking takes effect."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Expiry, Location> mmExpiryPlace = new MMBusinessAssociationEnd<Expiry, Location>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Expiry.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExpiryPlace";
			definition = "Place where the expiry of the undertaking takes effect.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Location.mmRelatedExpiry;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Location.mmObject();
		}

		@Override
		public Location getValue(Expiry obj) {
			return obj.getExpiryPlace();
		}

		@Override
		public void setValue(Expiry obj, Location value) {
			obj.setExpiryPlace(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Expiry";
				definition = "Expiry parameters.";
				associationDomain_lazy = () -> Arrays.asList(Location.mmRelatedExpiry, Undertaking.mmExpiry);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Expiry.mmExpiryDateTime, com.tools20022.repository.entity.Expiry.mmUndertaking, com.tools20022.repository.entity.Expiry.mmExpiryCondition,
						com.tools20022.repository.entity.Expiry.mmOpenEndedIndicator, com.tools20022.repository.entity.Expiry.mmExpiryPlace);
			}

			@Override
			public Class<?> getInstanceClass() {
				return Expiry.class;
			}
		});
		return mmObject_lazy.get();
	}

	public ISODateTime getExpiryDateTime() {
		return expiryDateTime;
	}

	public Expiry setExpiryDateTime(ISODateTime expiryDateTime) {
		this.expiryDateTime = Objects.requireNonNull(expiryDateTime);
		return this;
	}

	public Undertaking getUndertaking() {
		return undertaking;
	}

	public Expiry setUndertaking(Undertaking undertaking) {
		this.undertaking = Objects.requireNonNull(undertaking);
		return this;
	}

	public Max2000Text getExpiryCondition() {
		return expiryCondition;
	}

	public Expiry setExpiryCondition(Max2000Text expiryCondition) {
		this.expiryCondition = Objects.requireNonNull(expiryCondition);
		return this;
	}

	public YesNoIndicator getOpenEndedIndicator() {
		return openEndedIndicator;
	}

	public Expiry setOpenEndedIndicator(YesNoIndicator openEndedIndicator) {
		this.openEndedIndicator = Objects.requireNonNull(openEndedIndicator);
		return this;
	}

	public Location getExpiryPlace() {
		return expiryPlace;
	}

	public Expiry setExpiryPlace(Location expiryPlace) {
		this.expiryPlace = Objects.requireNonNull(expiryPlace);
		return this;
	}
}