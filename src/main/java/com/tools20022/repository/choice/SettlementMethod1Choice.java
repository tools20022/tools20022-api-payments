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

package com.tools20022.repository.choice;

import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.entity.CashEntry;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.CreditTransferTransaction27;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Settlement details to determine whether payment is a credit or debit.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SettlementMethod1Choice#mmCredit
 * SettlementMethod1Choice.mmCredit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SettlementMethod1Choice#mmDebit
 * SettlementMethod1Choice.mmDebit}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CashEntry CashEntry}</li>
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
 * "SettlementMethod1Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Settlement details to determine whether payment is a credit or debit."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SettlementMethod1Choice", propOrder = {"credit", "debit"})
public class SettlementMethod1Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Cdt", required = true)
	protected CreditTransferTransaction27 credit;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction27
	 * CreditTransferTransaction27}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.SettlementMethod1Choice
	 * SettlementMethod1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Cdt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Credit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies details of the payment to be made by the old account servicer to the new account servicer in case of a positive closing balance."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SettlementMethod1Choice, CreditTransferTransaction27> mmCredit = new MMMessageAssociationEnd<SettlementMethod1Choice, CreditTransferTransaction27>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.SettlementMethod1Choice.mmObject();
			isDerived = false;
			xmlTag = "Cdt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Credit";
			definition = "Specifies details of the payment to be made by the old account servicer to the new account servicer in case of a positive closing balance.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CreditTransferTransaction27.mmObject();
		}

		@Override
		public CreditTransferTransaction27 getValue(SettlementMethod1Choice obj) {
			return obj.getCredit();
		}

		@Override
		public void setValue(SettlementMethod1Choice obj, CreditTransferTransaction27 value) {
			obj.setCredit(value);
		}
	};
	@XmlElement(name = "Dbt", required = true)
	protected CreditTransferTransaction27 debit;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction27
	 * CreditTransferTransaction27}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.SettlementMethod1Choice
	 * SettlementMethod1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Dbt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Debit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies details of the payment to be made by the new account servicer to the old account servicer in case of a negative closing balance."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SettlementMethod1Choice, CreditTransferTransaction27> mmDebit = new MMMessageAssociationEnd<SettlementMethod1Choice, CreditTransferTransaction27>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.SettlementMethod1Choice.mmObject();
			isDerived = false;
			xmlTag = "Dbt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Debit";
			definition = "Specifies details of the payment to be made by the new account servicer to the old account servicer in case of a negative closing balance.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CreditTransferTransaction27.mmObject();
		}

		@Override
		public CreditTransferTransaction27 getValue(SettlementMethod1Choice obj) {
			return obj.getDebit();
		}

		@Override
		public void setValue(SettlementMethod1Choice obj, CreditTransferTransaction27 value) {
			obj.setDebit(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.SettlementMethod1Choice.mmCredit, com.tools20022.repository.choice.SettlementMethod1Choice.mmDebit);
				trace_lazy = () -> CashEntry.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "SettlementMethod1Choice";
				definition = "Settlement details to determine whether payment is a credit or debit.";
			}
		});
		return mmObject_lazy.get();
	}

	public CreditTransferTransaction27 getCredit() {
		return credit;
	}

	public SettlementMethod1Choice setCredit(CreditTransferTransaction27 credit) {
		this.credit = Objects.requireNonNull(credit);
		return this;
	}

	public CreditTransferTransaction27 getDebit() {
		return debit;
	}

	public SettlementMethod1Choice setDebit(CreditTransferTransaction27 debit) {
		this.debit = Objects.requireNonNull(debit);
		return this;
	}
}