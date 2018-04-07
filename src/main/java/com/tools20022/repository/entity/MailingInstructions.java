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
import com.tools20022.repository.entity.PostalAddress;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;

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
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
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
	public static final MMBusinessAttribute<MailingInstructions, YesNoIndicator> mmMailingIndicator = new MMBusinessAttribute<MailingInstructions, YesNoIndicator>() {
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

		@Override
		public YesNoIndicator getValue(MailingInstructions obj) {
			return obj.getMailingIndicator();
		}

		@Override
		public void setValue(MailingInstructions obj, YesNoIndicator value) {
			obj.setMailingIndicator(value);
		}
	};
	protected YesNoIndicator registrationAddressIndicator;
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
	public static final MMBusinessAttribute<MailingInstructions, YesNoIndicator> mmRegistrationAddressIndicator = new MMBusinessAttribute<MailingInstructions, YesNoIndicator>() {
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

		@Override
		public YesNoIndicator getValue(MailingInstructions obj) {
			return obj.getRegistrationAddressIndicator();
		}

		@Override
		public void setValue(MailingInstructions obj, YesNoIndicator value) {
			obj.setRegistrationAddressIndicator(value);
		}
	};
	protected PostalAddress relatedPostalAddress;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAssociationEnd<MailingInstructions, Optional<PostalAddress>> mmRelatedPostalAddress = new MMBusinessAssociationEnd<MailingInstructions, Optional<PostalAddress>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.MailingInstructions.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedPostalAddress";
			definition = "Postal address for which mailing instructions are specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> PostalAddress.mmMailingInstructions;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> PostalAddress.mmObject();
		}

		@Override
		public Optional<PostalAddress> getValue(MailingInstructions obj) {
			return obj.getRelatedPostalAddress();
		}

		@Override
		public void setValue(MailingInstructions obj, Optional<PostalAddress> value) {
			obj.setRelatedPostalAddress(value.orElse(null));
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MailingInstructions";
				definition = "Characteristics of an address.";
				associationDomain_lazy = () -> Arrays.asList(PostalAddress.mmMailingInstructions);
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

	public MailingInstructions setMailingIndicator(YesNoIndicator mailingIndicator) {
		this.mailingIndicator = Objects.requireNonNull(mailingIndicator);
		return this;
	}

	public YesNoIndicator getRegistrationAddressIndicator() {
		return registrationAddressIndicator;
	}

	public MailingInstructions setRegistrationAddressIndicator(YesNoIndicator registrationAddressIndicator) {
		this.registrationAddressIndicator = Objects.requireNonNull(registrationAddressIndicator);
		return this;
	}

	public Optional<PostalAddress> getRelatedPostalAddress() {
		return relatedPostalAddress == null ? Optional.empty() : Optional.of(relatedPostalAddress);
	}

	public MailingInstructions setRelatedPostalAddress(PostalAddress relatedPostalAddress) {
		this.relatedPostalAddress = relatedPostalAddress;
		return this;
	}
}