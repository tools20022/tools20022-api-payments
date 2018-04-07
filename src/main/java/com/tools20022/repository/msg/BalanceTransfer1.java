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
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.acmt.AccountSwitchBalanceTransferAcknowledgementV01;
import com.tools20022.repository.area.acmt.AccountSwitchInformationRequestV01;
import com.tools20022.repository.area.acmt.AccountSwitchRequestBalanceTransferV01;
import com.tools20022.repository.choice.SettlementMethod1Choice;
import com.tools20022.repository.entity.CashAccountContract;
import com.tools20022.repository.entity.CreditTransfer;
import com.tools20022.repository.entity.Limit;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.BalanceTransferFundingLimit1;
import com.tools20022.repository.msg.BalanceTransferReference1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Information that enables any payments made in connection with the fulfilment
 * of an account switch to be reconciled by the relevant account servicer with
 * the associated request.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BalanceTransfer1#mmBalanceTransferReference
 * BalanceTransfer1.mmBalanceTransferReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BalanceTransfer1#mmBalanceTransferMethod
 * BalanceTransfer1.mmBalanceTransferMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BalanceTransfer1#mmBalanceTransferFundingLimit
 * BalanceTransfer1.mmBalanceTransferFundingLimit}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CashAccountContract
 * CashAccountContract}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountSwitchBalanceTransferAcknowledgementV01#mmBalanceTransfer
 * AccountSwitchBalanceTransferAcknowledgementV01.mmBalanceTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountSwitchRequestBalanceTransferV01#mmBalanceTransfer
 * AccountSwitchRequestBalanceTransferV01.mmBalanceTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountSwitchInformationRequestV01#mmBalanceTransfer
 * AccountSwitchInformationRequestV01.mmBalanceTransfer}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "BalanceTransfer1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Information that enables any payments made in connection with the fulfilment of an account switch to be reconciled by the relevant account servicer with the associated request."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "BalanceTransfer1", propOrder = {"balanceTransferReference", "balanceTransferMethod", "balanceTransferFundingLimit"})
public class BalanceTransfer1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "BalTrfRef")
	protected BalanceTransferReference1 balanceTransferReference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.BalanceTransferReference1
	 * BalanceTransferReference1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashAccountContract#mmBalanceTransfer
	 * CashAccountContract.mmBalanceTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BalanceTransfer1
	 * BalanceTransfer1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BalTrfRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceTransferReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference that enables the creditor to reconcile a payment received through a different payment channel with the payment request."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<BalanceTransfer1, Optional<BalanceTransferReference1>> mmBalanceTransferReference = new MMMessageAssociationEnd<BalanceTransfer1, Optional<BalanceTransferReference1>>() {
		{
			businessElementTrace_lazy = () -> CashAccountContract.mmBalanceTransfer;
			componentContext_lazy = () -> com.tools20022.repository.msg.BalanceTransfer1.mmObject();
			isDerived = false;
			xmlTag = "BalTrfRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceTransferReference";
			definition = "Reference that enables the creditor to reconcile a payment received through a different payment channel with the payment request.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> BalanceTransferReference1.mmObject();
		}

		@Override
		public Optional<BalanceTransferReference1> getValue(BalanceTransfer1 obj) {
			return obj.getBalanceTransferReference();
		}

		@Override
		public void setValue(BalanceTransfer1 obj, Optional<BalanceTransferReference1> value) {
			obj.setBalanceTransferReference(value.orElse(null));
		}
	};
	@XmlElement(name = "BalTrfMtd")
	protected SettlementMethod1Choice balanceTransferMethod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.SettlementMethod1Choice
	 * SettlementMethod1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CreditTransfer
	 * CreditTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BalanceTransfer1
	 * BalanceTransfer1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BalTrfMtd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceTransferMethod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Contains details of the clearance and settlement method chosen to make the appropriate payment from account servicer to account servicer in order to transfer the positive or negative closing balance of the old account to the new account."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<BalanceTransfer1, Optional<SettlementMethod1Choice>> mmBalanceTransferMethod = new MMMessageAssociationEnd<BalanceTransfer1, Optional<SettlementMethod1Choice>>() {
		{
			businessComponentTrace_lazy = () -> CreditTransfer.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.BalanceTransfer1.mmObject();
			isDerived = false;
			xmlTag = "BalTrfMtd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceTransferMethod";
			definition = "Contains details of the clearance and settlement method chosen to make the appropriate payment from account servicer to account servicer in order to transfer the positive or negative closing balance of the old account to the new account.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SettlementMethod1Choice.mmObject();
		}

		@Override
		public Optional<SettlementMethod1Choice> getValue(BalanceTransfer1 obj) {
			return obj.getBalanceTransferMethod();
		}

		@Override
		public void setValue(BalanceTransfer1 obj, Optional<SettlementMethod1Choice> value) {
			obj.setBalanceTransferMethod(value.orElse(null));
		}
	};
	@XmlElement(name = "BalTrfFndgLmt")
	protected BalanceTransferFundingLimit1 balanceTransferFundingLimit;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.BalanceTransferFundingLimit1
	 * BalanceTransferFundingLimit1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Limit#mmAmount
	 * Limit.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BalanceTransfer1
	 * BalanceTransfer1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BalTrfFndgLmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceTransferFundingLimit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Maximum value that the new account servicer will pay to the old account servicer when the closing balance on the old account is negative."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<BalanceTransfer1, Optional<BalanceTransferFundingLimit1>> mmBalanceTransferFundingLimit = new MMMessageAssociationEnd<BalanceTransfer1, Optional<BalanceTransferFundingLimit1>>() {
		{
			businessElementTrace_lazy = () -> Limit.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.BalanceTransfer1.mmObject();
			isDerived = false;
			xmlTag = "BalTrfFndgLmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceTransferFundingLimit";
			definition = "Maximum value that the new account servicer will pay to the old account servicer when the closing balance on the old account is negative.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> BalanceTransferFundingLimit1.mmObject();
		}

		@Override
		public Optional<BalanceTransferFundingLimit1> getValue(BalanceTransfer1 obj) {
			return obj.getBalanceTransferFundingLimit();
		}

		@Override
		public void setValue(BalanceTransfer1 obj, Optional<BalanceTransferFundingLimit1> value) {
			obj.setBalanceTransferFundingLimit(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.BalanceTransfer1.mmBalanceTransferReference, com.tools20022.repository.msg.BalanceTransfer1.mmBalanceTransferMethod,
						com.tools20022.repository.msg.BalanceTransfer1.mmBalanceTransferFundingLimit);
				messageBuildingBlock_lazy = () -> Arrays.asList(AccountSwitchBalanceTransferAcknowledgementV01.mmBalanceTransfer, AccountSwitchRequestBalanceTransferV01.mmBalanceTransfer,
						AccountSwitchInformationRequestV01.mmBalanceTransfer);
				trace_lazy = () -> CashAccountContract.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "BalanceTransfer1";
				definition = "Information that enables any payments made in connection with the fulfilment of an account switch to be reconciled by the relevant account servicer with the associated request.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<BalanceTransferReference1> getBalanceTransferReference() {
		return balanceTransferReference == null ? Optional.empty() : Optional.of(balanceTransferReference);
	}

	public BalanceTransfer1 setBalanceTransferReference(BalanceTransferReference1 balanceTransferReference) {
		this.balanceTransferReference = balanceTransferReference;
		return this;
	}

	public Optional<SettlementMethod1Choice> getBalanceTransferMethod() {
		return balanceTransferMethod == null ? Optional.empty() : Optional.of(balanceTransferMethod);
	}

	public BalanceTransfer1 setBalanceTransferMethod(SettlementMethod1Choice balanceTransferMethod) {
		this.balanceTransferMethod = balanceTransferMethod;
		return this;
	}

	public Optional<BalanceTransferFundingLimit1> getBalanceTransferFundingLimit() {
		return balanceTransferFundingLimit == null ? Optional.empty() : Optional.of(balanceTransferFundingLimit);
	}

	public BalanceTransfer1 setBalanceTransferFundingLimit(BalanceTransferFundingLimit1 balanceTransferFundingLimit) {
		this.balanceTransferFundingLimit = balanceTransferFundingLimit;
		return this;
	}
}