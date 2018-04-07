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
import com.tools20022.repository.datatype.Max12Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Max70Text;
import com.tools20022.repository.entity.CashAccountService;
import com.tools20022.repository.entity.Entry;
import com.tools20022.repository.entity.Product;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.BankTransactionCodeStructure4;
import com.tools20022.repository.msg.BillingServiceCommonIdentification1;
import com.tools20022.repository.msg.BillingSubServiceIdentification1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Identification of the service to be billed.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BillingServiceIdentification3#mmIdentification
 * BillingServiceIdentification3.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BillingServiceIdentification3#mmSubService
 * BillingServiceIdentification3.mmSubService}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BillingServiceIdentification3#mmDescription
 * BillingServiceIdentification3.mmDescription}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BillingServiceIdentification3#mmCommonCode
 * BillingServiceIdentification3.mmCommonCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BillingServiceIdentification3#mmBankTransactionCode
 * BillingServiceIdentification3.mmBankTransactionCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BillingServiceIdentification3#mmServiceType
 * BillingServiceIdentification3.mmServiceType}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CashAccountService
 * CashAccountService}</li>
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
 * "BillingServiceIdentification3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Identification of the service to be billed."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "BillingServiceIdentification3", propOrder = {"identification", "subService", "description", "commonCode", "bankTransactionCode", "serviceType"})
public class BillingServiceIdentification3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Id", required = true)
	protected Max35Text identification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Product#mmName
	 * Product.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BillingServiceIdentification3
	 * BillingServiceIdentification3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Id"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Financial institution's own, internal service identification code, different from the common code.\nUsage: The financial institution own code is used to uniquely identify the service within the financial institution."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<BillingServiceIdentification3, Max35Text> mmIdentification = new MMMessageAttribute<BillingServiceIdentification3, Max35Text>() {
		{
			businessElementTrace_lazy = () -> Product.mmName;
			componentContext_lazy = () -> com.tools20022.repository.msg.BillingServiceIdentification3.mmObject();
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Financial institution's own, internal service identification code, different from the common code.\nUsage: The financial institution own code is used to uniquely identify the service within the financial institution.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(BillingServiceIdentification3 obj) {
			return obj.getIdentification();
		}

		@Override
		public void setValue(BillingServiceIdentification3 obj, Max35Text value) {
			obj.setIdentification(value);
		}
	};
	@XmlElement(name = "SubSvc")
	protected BillingSubServiceIdentification1 subService;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.BillingSubServiceIdentification1
	 * BillingSubServiceIdentification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashAccountService
	 * CashAccountService}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BillingServiceIdentification3
	 * BillingServiceIdentification3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SubSvc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubService"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Defines the financial institution sub-service identification if the financial institution service identification code is used for more than one service."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<BillingServiceIdentification3, Optional<BillingSubServiceIdentification1>> mmSubService = new MMMessageAttribute<BillingServiceIdentification3, Optional<BillingSubServiceIdentification1>>() {
		{
			businessComponentTrace_lazy = () -> CashAccountService.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.BillingServiceIdentification3.mmObject();
			isDerived = false;
			xmlTag = "SubSvc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubService";
			definition = "Defines the financial institution sub-service identification if the financial institution service identification code is used for more than one service.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> BillingSubServiceIdentification1.mmObject();
		}

		@Override
		public Optional<BillingSubServiceIdentification1> getValue(BillingServiceIdentification3 obj) {
			return obj.getSubService();
		}

		@Override
		public void setValue(BillingServiceIdentification3 obj, Optional<BillingSubServiceIdentification1> value) {
			obj.setSubService(value.orElse(null));
		}
	};
	@XmlElement(name = "Desc", required = true)
	protected Max70Text description;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max70Text
	 * Max70Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BillingServiceIdentification3
	 * BillingServiceIdentification3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Desc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Description"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies further details to describe the financial institution service description, which is not the standard description related to the common code."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<BillingServiceIdentification3, Max70Text> mmDescription = new MMMessageAttribute<BillingServiceIdentification3, Max70Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.BillingServiceIdentification3.mmObject();
			isDerived = false;
			xmlTag = "Desc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Description";
			definition = "Specifies further details to describe the financial institution service description, which is not the standard description related to the common code.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max70Text.mmObject();
		}

		@Override
		public Max70Text getValue(BillingServiceIdentification3 obj) {
			return obj.getDescription();
		}

		@Override
		public void setValue(BillingServiceIdentification3 obj, Max70Text value) {
			obj.setDescription(value);
		}
	};
	@XmlElement(name = "CmonCd")
	protected BillingServiceCommonIdentification1 commonCode;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.BillingServiceCommonIdentification1
	 * BillingServiceCommonIdentification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BillingServiceIdentification3
	 * BillingServiceIdentification3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CmonCd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommonCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Standard reference code used to uniquely identify this service across financial institutions. This is not the financial institution’s internal bank service identification."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<BillingServiceIdentification3, Optional<BillingServiceCommonIdentification1>> mmCommonCode = new MMMessageAttribute<BillingServiceIdentification3, Optional<BillingServiceCommonIdentification1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.BillingServiceIdentification3.mmObject();
			isDerived = false;
			xmlTag = "CmonCd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommonCode";
			definition = "Standard reference code used to uniquely identify this service across financial institutions. This is not the financial institution’s internal bank service identification.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> BillingServiceCommonIdentification1.mmObject();
		}

		@Override
		public Optional<BillingServiceCommonIdentification1> getValue(BillingServiceIdentification3 obj) {
			return obj.getCommonCode();
		}

		@Override
		public void setValue(BillingServiceIdentification3 obj, Optional<BillingServiceCommonIdentification1> value) {
			obj.setCommonCode(value.orElse(null));
		}
	};
	@XmlElement(name = "BkTxCd")
	protected BankTransactionCodeStructure4 bankTransactionCode;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.BankTransactionCodeStructure4
	 * BankTransactionCodeStructure4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Entry#mmBankTransactionCode
	 * Entry.mmBankTransactionCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BillingServiceIdentification3
	 * BillingServiceIdentification3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BkTxCd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BankTransactionCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Full identification of the type of underlying transaction resulting in an service billing."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<BillingServiceIdentification3, Optional<BankTransactionCodeStructure4>> mmBankTransactionCode = new MMMessageAssociationEnd<BillingServiceIdentification3, Optional<BankTransactionCodeStructure4>>() {
		{
			businessElementTrace_lazy = () -> Entry.mmBankTransactionCode;
			componentContext_lazy = () -> com.tools20022.repository.msg.BillingServiceIdentification3.mmObject();
			isDerived = false;
			xmlTag = "BkTxCd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BankTransactionCode";
			definition = "Full identification of the type of underlying transaction resulting in an service billing.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> BankTransactionCodeStructure4.mmObject();
		}

		@Override
		public Optional<BankTransactionCodeStructure4> getValue(BillingServiceIdentification3 obj) {
			return obj.getBankTransactionCode();
		}

		@Override
		public void setValue(BillingServiceIdentification3 obj, Optional<BankTransactionCodeStructure4> value) {
			obj.setBankTransactionCode(value.orElse(null));
		}
	};
	@XmlElement(name = "SvcTp")
	protected Max12Text serviceType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max12Text
	 * Max12Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BillingServiceIdentification3
	 * BillingServiceIdentification3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SvcTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ServiceType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Type used to classify or organise different services by common characteristics."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<BillingServiceIdentification3, Optional<Max12Text>> mmServiceType = new MMMessageAttribute<BillingServiceIdentification3, Optional<Max12Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.BillingServiceIdentification3.mmObject();
			isDerived = false;
			xmlTag = "SvcTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ServiceType";
			definition = "Type used to classify or organise different services by common characteristics.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max12Text.mmObject();
		}

		@Override
		public Optional<Max12Text> getValue(BillingServiceIdentification3 obj) {
			return obj.getServiceType();
		}

		@Override
		public void setValue(BillingServiceIdentification3 obj, Optional<Max12Text> value) {
			obj.setServiceType(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.BillingServiceIdentification3.mmIdentification, com.tools20022.repository.msg.BillingServiceIdentification3.mmSubService,
						com.tools20022.repository.msg.BillingServiceIdentification3.mmDescription, com.tools20022.repository.msg.BillingServiceIdentification3.mmCommonCode,
						com.tools20022.repository.msg.BillingServiceIdentification3.mmBankTransactionCode, com.tools20022.repository.msg.BillingServiceIdentification3.mmServiceType);
				trace_lazy = () -> CashAccountService.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "BillingServiceIdentification3";
				definition = "Identification of the service to be billed.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getIdentification() {
		return identification;
	}

	public BillingServiceIdentification3 setIdentification(Max35Text identification) {
		this.identification = Objects.requireNonNull(identification);
		return this;
	}

	public Optional<BillingSubServiceIdentification1> getSubService() {
		return subService == null ? Optional.empty() : Optional.of(subService);
	}

	public BillingServiceIdentification3 setSubService(BillingSubServiceIdentification1 subService) {
		this.subService = subService;
		return this;
	}

	public Max70Text getDescription() {
		return description;
	}

	public BillingServiceIdentification3 setDescription(Max70Text description) {
		this.description = Objects.requireNonNull(description);
		return this;
	}

	public Optional<BillingServiceCommonIdentification1> getCommonCode() {
		return commonCode == null ? Optional.empty() : Optional.of(commonCode);
	}

	public BillingServiceIdentification3 setCommonCode(BillingServiceCommonIdentification1 commonCode) {
		this.commonCode = commonCode;
		return this;
	}

	public Optional<BankTransactionCodeStructure4> getBankTransactionCode() {
		return bankTransactionCode == null ? Optional.empty() : Optional.of(bankTransactionCode);
	}

	public BillingServiceIdentification3 setBankTransactionCode(BankTransactionCodeStructure4 bankTransactionCode) {
		this.bankTransactionCode = bankTransactionCode;
		return this;
	}

	public Optional<Max12Text> getServiceType() {
		return serviceType == null ? Optional.empty() : Optional.of(serviceType);
	}

	public BillingServiceIdentification3 setServiceType(Max12Text serviceType) {
		this.serviceType = serviceType;
		return this;
	}
}