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
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.GeneratedRepository;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Characteristics of an address.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="MailingInstructions" src="doc-files/MailingInstructions.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MailingInstructions#mmMailingIndicator
 * MailingInstructions.mmMailingIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MailingInstructions#mmRegistrationAddressIndicator
 * MailingInstructions.mmRegistrationAddressIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MailingInstructions#mmRelatedPostalAddress
 * MailingInstructions.mmRelatedPostalAddress}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PostalAddress#mmMailingInstructions
 * PostalAddress.mmMailingInstructions}</li>
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
 * "MailingInstructions"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Characteristics of an address."</li>
 * </ul>
 */
public class MailingInstructions {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected YesNoIndicator mailingIndicator;
	/**
	 * Indicates whether mail should be sent to an address.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.MailingInstructions
	 * MailingInstructions}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MailingIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether mail should be sent to an address."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmMailingIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.MailingInstructions.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MailingIndicator";
			definition = "Indicates whether mail should be sent to an address.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return MailingInstructions.class.getMethod("getMailingIndicator", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected YesNoIndicator registrationAddressIndicator;
	/**
	 * Indicates whether the address is the official address of the party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.MailingInstructions
	 * MailingInstructions}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegistrationAddressIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the address is the official address of the party."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmRegistrationAddressIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.MailingInstructions.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RegistrationAddressIndicator";
			definition = "Indicates whether the address is the official address of the party.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return MailingInstructions.class.getMethod("getRegistrationAddressIndicator", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected PostalAddress relatedPostalAddress;
	/**
	 * Postal address for which mailing instructions are specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PostalAddress#mmMailingInstructions
	 * PostalAddress.mmMailingInstructions}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PostalAddress
	 * PostalAddress}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.MailingInstructions
	 * MailingInstructions}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedPostalAddress"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Postal address for which mailing instructions are specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedPostalAddress = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.MailingInstructions.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedPostalAddress";
			definition = "Postal address for which mailing instructions are specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.PostalAddress.mmMailingInstructions;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PostalAddress.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MailingInstructions";
				definition = "Characteristics of an address.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.PostalAddress.mmMailingInstructions);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.MailingInstructions.mmMailingIndicator, com.tools20022.repository.entity.MailingInstructions.mmRegistrationAddressIndicator,
						com.tools20022.repository.entity.MailingInstructions.mmRelatedPostalAddress);
			}

			@Override
			public Class<?> getInstanceClass() {
				return MailingInstructions.class;
			}
		});
		return mmObject_lazy.get();
	}

	public YesNoIndicator getMailingIndicator() {
		return mailingIndicator;
	}

	public void setMailingIndicator(YesNoIndicator mailingIndicator) {
		this.mailingIndicator = mailingIndicator;
	}

	public YesNoIndicator getRegistrationAddressIndicator() {
		return registrationAddressIndicator;
	}

	public void setRegistrationAddressIndicator(YesNoIndicator registrationAddressIndicator) {
		this.registrationAddressIndicator = registrationAddressIndicator;
	}

	public PostalAddress getRelatedPostalAddress() {
		return relatedPostalAddress;
	}

	public void setRelatedPostalAddress(com.tools20022.repository.entity.PostalAddress relatedPostalAddress) {
		this.relatedPostalAddress = relatedPostalAddress;
	}
}