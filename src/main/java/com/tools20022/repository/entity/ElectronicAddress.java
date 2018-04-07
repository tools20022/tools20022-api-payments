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
import com.tools20022.repository.datatype.Max256Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.ContactPoint;
import com.tools20022.repository.entity.Presentation;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;

/**
 * Address which is accessed by electronic means.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="ElectronicAddress" src="doc-files/ElectronicAddress.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.ContactPoint
 * ContactPoint}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ElectronicAddress#mmEmailAddress
 * ElectronicAddress.mmEmailAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ElectronicAddress#mmURLAddress
 * ElectronicAddress.mmURLAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ElectronicAddress#mmTelexAddress
 * ElectronicAddress.mmTelexAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ElectronicAddress#mmRelatedPresentation
 * ElectronicAddress.mmRelatedPresentation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ElectronicAddress#mmTeletextAddress
 * ElectronicAddress.mmTeletextAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ElectronicAddress#mmISDNAddress
 * ElectronicAddress.mmISDNAddress}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Presentation#mmElectronicPresentationAddress
 * Presentation.mmElectronicPresentationAddress}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatementFrequencyAndForm1#mmDeliveryAddress
 * StatementFrequencyAndForm1.mmDeliveryAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RemittanceLocationDetails1#mmElectronicAddress
 * RemittanceLocationDetails1.mmElectronicAddress}</li>
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
 * "ElectronicAddress"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Address which is accessed by electronic means."</li>
 * </ul>
 */
public class ElectronicAddress extends ContactPoint {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected Max256Text emailAddress;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max256Text
	 * Max256Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CommunicationAddress3#mmEmail
	 * CommunicationAddress3.mmEmail}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ContactDetails2#mmEmailAddress
	 * ContactDetails2.mmEmailAddress}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ContactDetails3#mmEmailAddress
	 * ContactDetails3.mmEmailAddress}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ElectronicAddress
	 * ElectronicAddress}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EmailAddress"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Address for electronic mail (e-mail)."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<ElectronicAddress, Max256Text> mmEmailAddress = new MMBusinessAttribute<ElectronicAddress, Max256Text>() {
		{
			derivation_lazy = () -> Arrays.asList(CommunicationAddress3.mmEmail, ContactDetails2.mmEmailAddress, ContactDetails3.mmEmailAddress);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ElectronicAddress.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EmailAddress";
			definition = "Address for electronic mail (e-mail).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max256Text.mmObject();
		}

		@Override
		public Max256Text getValue(ElectronicAddress obj) {
			return obj.getEmailAddress();
		}

		@Override
		public void setValue(ElectronicAddress obj, Max256Text value) {
			obj.setEmailAddress(value);
		}
	};
	protected Max256Text uRLAddress;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max256Text
	 * Max256Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CommunicationAddress3#mmURLAddress
	 * CommunicationAddress3.mmURLAddress}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentGeneralInformation3#mmURL
	 * DocumentGeneralInformation3.mmURL}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ElectronicAddress
	 * ElectronicAddress}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "URLAddress"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Address for the Universal Resource Locator (URL), eg, used over the www (HTTP) service."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<ElectronicAddress, Max256Text> mmURLAddress = new MMBusinessAttribute<ElectronicAddress, Max256Text>() {
		{
			derivation_lazy = () -> Arrays.asList(CommunicationAddress3.mmURLAddress, DocumentGeneralInformation3.mmURL);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ElectronicAddress.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "URLAddress";
			definition = "Address for the Universal Resource Locator (URL), eg, used over the www (HTTP) service.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max256Text.mmObject();
		}

		@Override
		public Max256Text getValue(ElectronicAddress obj) {
			return obj.getURLAddress();
		}

		@Override
		public void setValue(ElectronicAddress obj, Max256Text value) {
			obj.setURLAddress(value);
		}
	};
	protected Max35Text telexAddress;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CommunicationAddress3#mmTelexAddress
	 * CommunicationAddress3.mmTelexAddress}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ElectronicAddress
	 * ElectronicAddress}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TelexAddress"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Address for a telex machine."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<ElectronicAddress, Max35Text> mmTelexAddress = new MMBusinessAttribute<ElectronicAddress, Max35Text>() {
		{
			derivation_lazy = () -> Arrays.asList(CommunicationAddress3.mmTelexAddress);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ElectronicAddress.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TelexAddress";
			definition = "Address for a telex machine.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(ElectronicAddress obj) {
			return obj.getTelexAddress();
		}

		@Override
		public void setValue(ElectronicAddress obj, Max35Text value) {
			obj.setTelexAddress(value);
		}
	};
	protected Presentation relatedPresentation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Presentation#mmElectronicPresentationAddress
	 * Presentation.mmElectronicPresentationAddress}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Presentation
	 * Presentation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ElectronicAddress
	 * ElectronicAddress}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedPresentation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Presentation process for which an electronic presentation address is specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<ElectronicAddress, Presentation> mmRelatedPresentation = new MMBusinessAssociationEnd<ElectronicAddress, Presentation>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ElectronicAddress.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedPresentation";
			definition = "Presentation process for which an electronic presentation address is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Presentation.mmElectronicPresentationAddress;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Presentation.mmObject();
		}

		@Override
		public Presentation getValue(ElectronicAddress obj) {
			return obj.getRelatedPresentation();
		}

		@Override
		public void setValue(ElectronicAddress obj, Presentation value) {
			obj.setRelatedPresentation(value);
		}
	};
	protected Max35Text teletextAddress;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ElectronicAddress
	 * ElectronicAddress}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TeletextAddress"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Address for a teletext."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<ElectronicAddress, Max35Text> mmTeletextAddress = new MMBusinessAttribute<ElectronicAddress, Max35Text>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ElectronicAddress.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TeletextAddress";
			definition = "Address for a teletext.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(ElectronicAddress obj) {
			return obj.getTeletextAddress();
		}

		@Override
		public void setValue(ElectronicAddress obj, Max35Text value) {
			obj.setTeletextAddress(value);
		}
	};
	protected Max35Text iSDNAddress;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ElectronicAddress
	 * ElectronicAddress}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ISDNAddress"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Address for an Integrated Services Digital Network."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<ElectronicAddress, Max35Text> mmISDNAddress = new MMBusinessAttribute<ElectronicAddress, Max35Text>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ElectronicAddress.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ISDNAddress";
			definition = "Address for an Integrated Services Digital Network.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(ElectronicAddress obj) {
			return obj.getISDNAddress();
		}

		@Override
		public void setValue(ElectronicAddress obj, Max35Text value) {
			obj.setISDNAddress(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ElectronicAddress";
				definition = "Address which is accessed by electronic means.";
				associationDomain_lazy = () -> Arrays.asList(Presentation.mmElectronicPresentationAddress);
				derivationElement_lazy = () -> Arrays.asList(StatementFrequencyAndForm1.mmDeliveryAddress, RemittanceLocationDetails1.mmElectronicAddress);
				superType_lazy = () -> ContactPoint.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ElectronicAddress.mmEmailAddress, com.tools20022.repository.entity.ElectronicAddress.mmURLAddress,
						com.tools20022.repository.entity.ElectronicAddress.mmTelexAddress, com.tools20022.repository.entity.ElectronicAddress.mmRelatedPresentation, com.tools20022.repository.entity.ElectronicAddress.mmTeletextAddress,
						com.tools20022.repository.entity.ElectronicAddress.mmISDNAddress);
			}

			@Override
			public Class<?> getInstanceClass() {
				return ElectronicAddress.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Max256Text getEmailAddress() {
		return emailAddress;
	}

	public ElectronicAddress setEmailAddress(Max256Text emailAddress) {
		this.emailAddress = Objects.requireNonNull(emailAddress);
		return this;
	}

	public Max256Text getURLAddress() {
		return uRLAddress;
	}

	public ElectronicAddress setURLAddress(Max256Text uRLAddress) {
		this.uRLAddress = Objects.requireNonNull(uRLAddress);
		return this;
	}

	public Max35Text getTelexAddress() {
		return telexAddress;
	}

	public ElectronicAddress setTelexAddress(Max35Text telexAddress) {
		this.telexAddress = Objects.requireNonNull(telexAddress);
		return this;
	}

	public Presentation getRelatedPresentation() {
		return relatedPresentation;
	}

	public ElectronicAddress setRelatedPresentation(Presentation relatedPresentation) {
		this.relatedPresentation = Objects.requireNonNull(relatedPresentation);
		return this;
	}

	public Max35Text getTeletextAddress() {
		return teletextAddress;
	}

	public ElectronicAddress setTeletextAddress(Max35Text teletextAddress) {
		this.teletextAddress = Objects.requireNonNull(teletextAddress);
		return this;
	}

	public Max35Text getISDNAddress() {
		return iSDNAddress;
	}

	public ElectronicAddress setISDNAddress(Max35Text iSDNAddress) {
		this.iSDNAddress = Objects.requireNonNull(iSDNAddress);
		return this;
	}
}