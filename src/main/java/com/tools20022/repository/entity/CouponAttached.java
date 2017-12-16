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
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Max3NumericText;
import com.tools20022.repository.GeneratedRepository;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Physical certificates representing rights attached to the physical
 * certificates representing a security.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="CouponAttached" src="doc-files/CouponAttached.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.CouponAttached#mmDate
 * CouponAttached.mmDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CouponAttached#mmNumber
 * CouponAttached.mmNumber}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CouponAttached#mmSecurity
 * CouponAttached.mmSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CouponAttached#mmCouponClippingDate
 * CouponAttached.mmCouponClippingDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CouponAttached#mmIdentification
 * CouponAttached.mmIdentification}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Security#mmCouponAttached
 * Security.mmCouponAttached}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CouponAttached"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Physical certificates representing rights attached to the physical certificates representing a security."
 * </li>
 * </ul>
 */
public class CouponAttached {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected ISODate date;
	/**
	 * Date of the coupon attached to the physical security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CouponAttached
	 * CouponAttached}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Date"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date of the coupon attached to the physical security."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CouponAttached.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Date";
			definition = "Date of the coupon attached to the physical security.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CouponAttached.class.getMethod("getDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max3NumericText number;
	/**
	 * Number of the coupon attached to the physical security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max3NumericText
	 * Max3NumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CouponAttached
	 * CouponAttached}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Number"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of the coupon attached to the physical security."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmNumber = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CouponAttached.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Number";
			definition = "Number of the coupon attached to the physical security.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max3NumericText.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CouponAttached.class.getMethod("getNumber", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Security security;
	/**
	 * Instrument to which a coupon is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmCouponAttached
	 * Security.mmCouponAttached}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Security Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CouponAttached
	 * CouponAttached}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Security"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Instrument to which a coupon is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmSecurity = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CouponAttached.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Security";
			definition = "Instrument to which a coupon is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Security.mmCouponAttached;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
		}
	};
	protected ISODateTime couponClippingDate;
	/**
	 * Date on which the coupons are to be/were submitted for payment of
	 * interest.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CouponAttached
	 * CouponAttached}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CouponClippingDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which the coupons are to be/were submitted for payment of interest."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmCouponClippingDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CouponAttached.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CouponClippingDate";
			definition = "Date on which the coupons are to be/were submitted for payment of interest.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CouponAttached.class.getMethod("getCouponClippingDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max35Text identification;
	/**
	 * Identification of the coupon.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CouponAttached
	 * CouponAttached}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the coupon."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmIdentification = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CouponAttached.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Identification";
			definition = "Identification of the coupon.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CouponAttached.class.getMethod("getIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CouponAttached";
				definition = "Physical certificates representing rights attached to the physical certificates representing a security.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Security.mmCouponAttached);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CouponAttached.mmDate, com.tools20022.repository.entity.CouponAttached.mmNumber, com.tools20022.repository.entity.CouponAttached.mmSecurity,
						com.tools20022.repository.entity.CouponAttached.mmCouponClippingDate, com.tools20022.repository.entity.CouponAttached.mmIdentification);
			}

			@Override
			public Class<?> getInstanceClass() {
				return CouponAttached.class;
			}
		});
		return mmObject_lazy.get();
	}

	public ISODate getDate() {
		return date;
	}

	public void setDate(ISODate date) {
		this.date = date;
	}

	public Max3NumericText getNumber() {
		return number;
	}

	public void setNumber(Max3NumericText number) {
		this.number = number;
	}

	public Security getSecurity() {
		return security;
	}

	public void setSecurity(com.tools20022.repository.entity.Security security) {
		this.security = security;
	}

	public ISODateTime getCouponClippingDate() {
		return couponClippingDate;
	}

	public void setCouponClippingDate(ISODateTime couponClippingDate) {
		this.couponClippingDate = couponClippingDate;
	}

	public Max35Text getIdentification() {
		return identification;
	}

	public void setIdentification(Max35Text identification) {
		this.identification = identification;
	}
}