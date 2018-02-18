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

package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAndAmount;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max140Text;
import com.tools20022.repository.datatype.TrueFalseIndicator;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides remittance information about a payment for garnishment-related
 * purposes.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Garnishment1#mmType
 * Garnishment1.mmType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Garnishment1#mmGarnishee
 * Garnishment1.mmGarnishee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Garnishment1#mmGarnishmentAdministrator
 * Garnishment1.mmGarnishmentAdministrator}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Garnishment1#mmReferenceNumber
 * Garnishment1.mmReferenceNumber}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Garnishment1#mmDate
 * Garnishment1.mmDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Garnishment1#mmRemittedAmount
 * Garnishment1.mmRemittedAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Garnishment1#mmFamilyMedicalInsuranceIndicator
 * Garnishment1.mmFamilyMedicalInsuranceIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Garnishment1#mmEmployeeTerminationIndicator
 * Garnishment1.mmEmployeeTerminationIndicator}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Garnishment
 * Garnishment}</li>
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
 * "Garnishment1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides remittance information about a payment for garnishment-related purposes. "
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Garnishment1", propOrder = {"type", "garnishee", "garnishmentAdministrator", "referenceNumber", "date", "remittedAmount", "familyMedicalInsuranceIndicator", "employeeTerminationIndicator"})
public class Garnishment1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Tp", required = true)
	protected GarnishmentType1 type;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.GarnishmentType1
	 * GarnishmentType1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmAssociatedDocument
	 * PaymentObligation.mmAssociatedDocument}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Garnishment1 Garnishment1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Tp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the type of garnishment."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmType = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> PaymentObligation.mmAssociatedDocument;
			componentContext_lazy = () -> com.tools20022.repository.msg.Garnishment1.mmObject();
			isDerived = false;
			xmlTag = "Tp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Specifies the type of garnishment.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.GarnishmentType1.mmObject();
		}
	};
	@XmlElement(name = "Grnshee")
	protected PartyIdentification43 garnishee;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification43
	 * PartyIdentification43}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.UltimateDebtorRole
	 * UltimateDebtorRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Garnishment1 Garnishment1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Grnshee"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Garnishee"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Ultimate party that owes an amount of money to the (ultimate) creditor, in this case, to the garnisher."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmGarnishee = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> UltimateDebtorRole.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.Garnishment1.mmObject();
			isDerived = false;
			xmlTag = "Grnshee";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Garnishee";
			definition = "Ultimate party that owes an amount of money to the (ultimate) creditor, in this case, to the garnisher.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PartyIdentification43.mmObject();
		}
	};
	@XmlElement(name = "GrnshmtAdmstr")
	protected PartyIdentification43 garnishmentAdministrator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification43
	 * PartyIdentification43}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Garnishment1 Garnishment1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "GrnshmtAdmstr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GarnishmentAdministrator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party on the credit side of the transaction who administers the garnishment on behalf of the ultimate beneficiary."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmGarnishmentAdministrator = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.Garnishment1.mmObject();
			isDerived = false;
			xmlTag = "GrnshmtAdmstr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GarnishmentAdministrator";
			definition = "Party on the credit side of the transaction who administers the garnishment on behalf of the ultimate beneficiary.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PartyIdentification43.mmObject();
		}
	};
	@XmlElement(name = "RefNb")
	protected Max140Text referenceNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max140Text
	 * Max140Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmIdentification
	 * Tax.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Garnishment1 Garnishment1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RefNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReferenceNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference information that is specific to the agency receiving the garnishment."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmReferenceNumber = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Tax.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.Garnishment1.mmObject();
			isDerived = false;
			xmlTag = "RefNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReferenceNumber";
			definition = "Reference information that is specific to the agency receiving the garnishment.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max140Text.mmObject();
		}
	};
	@XmlElement(name = "Dt")
	protected ISODate date;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Trade#mmTradeDateTime
	 * Trade.mmTradeDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Garnishment1 Garnishment1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Dt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Date"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date of payment which garnishment was taken from."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Trade.mmTradeDateTime;
			componentContext_lazy = () -> com.tools20022.repository.msg.Garnishment1.mmObject();
			isDerived = false;
			xmlTag = "Dt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Date";
			definition = "Date of payment which garnishment was taken from.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	@XmlElement(name = "RmtdAmt")
	protected ActiveOrHistoricCurrencyAndAmount remittedAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAndAmount
	 * ActiveOrHistoricCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Document#mmRemittedAmount
	 * Document.mmRemittedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Garnishment1 Garnishment1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RmtdAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RemittedAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of money remitted for the referred document."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRemittedAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Document.mmRemittedAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.Garnishment1.mmObject();
			isDerived = false;
			xmlTag = "RmtdAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RemittedAmount";
			definition = "Amount of money remitted for the referred document.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyAndAmount.mmObject();
		}
	};
	@XmlElement(name = "FmlyMdclInsrncInd")
	protected TrueFalseIndicator familyMedicalInsuranceIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.TrueFalseIndicator
	 * TrueFalseIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PersonProfile#mmFamilyMedicalInsuranceIndicator
	 * PersonProfile.mmFamilyMedicalInsuranceIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Garnishment1 Garnishment1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FmlyMdclInsrncInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FamilyMedicalInsuranceIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates if the person to whom the garnishment applies (that is, the ultimate debtor) has family medical insurance coverage available. "
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmFamilyMedicalInsuranceIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PersonProfile.mmFamilyMedicalInsuranceIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.Garnishment1.mmObject();
			isDerived = false;
			xmlTag = "FmlyMdclInsrncInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FamilyMedicalInsuranceIndicator";
			definition = "Indicates if the person to whom the garnishment applies (that is, the ultimate debtor) has family medical insurance coverage available. ";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
	@XmlElement(name = "MplyeeTermntnInd")
	protected TrueFalseIndicator employeeTerminationIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.TrueFalseIndicator
	 * TrueFalseIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PersonProfile#mmEmployeeTerminationIndicator
	 * PersonProfile.mmEmployeeTerminationIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Garnishment1 Garnishment1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MplyeeTermntnInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EmployeeTerminationIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates if the employment of the person to whom the garnishment applies (that is, the ultimate debtor) has been terminated."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmEmployeeTerminationIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PersonProfile.mmEmployeeTerminationIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.Garnishment1.mmObject();
			isDerived = false;
			xmlTag = "MplyeeTermntnInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EmployeeTerminationIndicator";
			definition = "Indicates if the employment of the person to whom the garnishment applies (that is, the ultimate debtor) has been terminated.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Garnishment1.mmType, com.tools20022.repository.msg.Garnishment1.mmGarnishee, com.tools20022.repository.msg.Garnishment1.mmGarnishmentAdministrator,
						com.tools20022.repository.msg.Garnishment1.mmReferenceNumber, com.tools20022.repository.msg.Garnishment1.mmDate, com.tools20022.repository.msg.Garnishment1.mmRemittedAmount,
						com.tools20022.repository.msg.Garnishment1.mmFamilyMedicalInsuranceIndicator, com.tools20022.repository.msg.Garnishment1.mmEmployeeTerminationIndicator);
				trace_lazy = () -> Garnishment.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Garnishment1";
				definition = "Provides remittance information about a payment for garnishment-related purposes. ";
			}
		});
		return mmObject_lazy.get();
	}

	public GarnishmentType1 getType() {
		return type;
	}

	public Garnishment1 setType(com.tools20022.repository.msg.GarnishmentType1 type) {
		this.type = Objects.requireNonNull(type);
		return this;
	}

	public Optional<PartyIdentification43> getGarnishee() {
		return garnishee == null ? Optional.empty() : Optional.of(garnishee);
	}

	public Garnishment1 setGarnishee(com.tools20022.repository.msg.PartyIdentification43 garnishee) {
		this.garnishee = garnishee;
		return this;
	}

	public Optional<PartyIdentification43> getGarnishmentAdministrator() {
		return garnishmentAdministrator == null ? Optional.empty() : Optional.of(garnishmentAdministrator);
	}

	public Garnishment1 setGarnishmentAdministrator(com.tools20022.repository.msg.PartyIdentification43 garnishmentAdministrator) {
		this.garnishmentAdministrator = garnishmentAdministrator;
		return this;
	}

	public Optional<Max140Text> getReferenceNumber() {
		return referenceNumber == null ? Optional.empty() : Optional.of(referenceNumber);
	}

	public Garnishment1 setReferenceNumber(Max140Text referenceNumber) {
		this.referenceNumber = referenceNumber;
		return this;
	}

	public Optional<ISODate> getDate() {
		return date == null ? Optional.empty() : Optional.of(date);
	}

	public Garnishment1 setDate(ISODate date) {
		this.date = date;
		return this;
	}

	public Optional<ActiveOrHistoricCurrencyAndAmount> getRemittedAmount() {
		return remittedAmount == null ? Optional.empty() : Optional.of(remittedAmount);
	}

	public Garnishment1 setRemittedAmount(ActiveOrHistoricCurrencyAndAmount remittedAmount) {
		this.remittedAmount = remittedAmount;
		return this;
	}

	public Optional<TrueFalseIndicator> getFamilyMedicalInsuranceIndicator() {
		return familyMedicalInsuranceIndicator == null ? Optional.empty() : Optional.of(familyMedicalInsuranceIndicator);
	}

	public Garnishment1 setFamilyMedicalInsuranceIndicator(TrueFalseIndicator familyMedicalInsuranceIndicator) {
		this.familyMedicalInsuranceIndicator = familyMedicalInsuranceIndicator;
		return this;
	}

	public Optional<TrueFalseIndicator> getEmployeeTerminationIndicator() {
		return employeeTerminationIndicator == null ? Optional.empty() : Optional.of(employeeTerminationIndicator);
	}

	public Garnishment1 setEmployeeTerminationIndicator(TrueFalseIndicator employeeTerminationIndicator) {
		this.employeeTerminationIndicator = employeeTerminationIndicator;
		return this;
	}
}