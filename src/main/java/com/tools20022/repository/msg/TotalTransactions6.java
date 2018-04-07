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
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.NumberAndSumOfTransactions1;
import com.tools20022.repository.msg.NumberAndSumOfTransactions4;
import com.tools20022.repository.msg.TotalsPerBankTransactionCode5;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Set of elements used to provide summary information on entries.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TotalTransactions6#mmTotalEntries
 * TotalTransactions6.mmTotalEntries}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TotalTransactions6#mmTotalCreditEntries
 * TotalTransactions6.mmTotalCreditEntries}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TotalTransactions6#mmTotalDebitEntries
 * TotalTransactions6.mmTotalDebitEntries}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TotalTransactions6#mmTotalEntriesPerBankTransactionCode
 * TotalTransactions6.mmTotalEntriesPerBankTransactionCode}</li>
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
 * "TotalTransactions6"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Set of elements used to provide summary information on entries."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "TotalTransactions6", propOrder = {"totalEntries", "totalCreditEntries", "totalDebitEntries", "totalEntriesPerBankTransactionCode"})
public class TotalTransactions6 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "TtlNtries")
	protected NumberAndSumOfTransactions4 totalEntries;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.NumberAndSumOfTransactions4
	 * NumberAndSumOfTransactions4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TotalTransactions6
	 * TotalTransactions6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlNtries"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalEntries"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the total number and sum of debit and credit entries."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TotalTransactions6, Optional<NumberAndSumOfTransactions4>> mmTotalEntries = new MMMessageAssociationEnd<TotalTransactions6, Optional<NumberAndSumOfTransactions4>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TotalTransactions6.mmObject();
			isDerived = false;
			xmlTag = "TtlNtries";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalEntries";
			definition = "Specifies the total number and sum of debit and credit entries.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> NumberAndSumOfTransactions4.mmObject();
		}

		@Override
		public Optional<NumberAndSumOfTransactions4> getValue(TotalTransactions6 obj) {
			return obj.getTotalEntries();
		}

		@Override
		public void setValue(TotalTransactions6 obj, Optional<NumberAndSumOfTransactions4> value) {
			obj.setTotalEntries(value.orElse(null));
		}
	};
	@XmlElement(name = "TtlCdtNtries")
	protected NumberAndSumOfTransactions1 totalCreditEntries;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.NumberAndSumOfTransactions1
	 * NumberAndSumOfTransactions1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TotalTransactions6
	 * TotalTransactions6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlCdtNtries"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalCreditEntries"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the total number and sum of credit entries."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TotalTransactions6, Optional<NumberAndSumOfTransactions1>> mmTotalCreditEntries = new MMMessageAssociationEnd<TotalTransactions6, Optional<NumberAndSumOfTransactions1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TotalTransactions6.mmObject();
			isDerived = false;
			xmlTag = "TtlCdtNtries";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalCreditEntries";
			definition = "Specifies the total number and sum of credit entries.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> NumberAndSumOfTransactions1.mmObject();
		}

		@Override
		public Optional<NumberAndSumOfTransactions1> getValue(TotalTransactions6 obj) {
			return obj.getTotalCreditEntries();
		}

		@Override
		public void setValue(TotalTransactions6 obj, Optional<NumberAndSumOfTransactions1> value) {
			obj.setTotalCreditEntries(value.orElse(null));
		}
	};
	@XmlElement(name = "TtlDbtNtries")
	protected NumberAndSumOfTransactions1 totalDebitEntries;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.NumberAndSumOfTransactions1
	 * NumberAndSumOfTransactions1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TotalTransactions6
	 * TotalTransactions6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlDbtNtries"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalDebitEntries"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the total number and sum of debit entries."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TotalTransactions6, Optional<NumberAndSumOfTransactions1>> mmTotalDebitEntries = new MMMessageAssociationEnd<TotalTransactions6, Optional<NumberAndSumOfTransactions1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TotalTransactions6.mmObject();
			isDerived = false;
			xmlTag = "TtlDbtNtries";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalDebitEntries";
			definition = "Specifies the total number and sum of debit entries.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> NumberAndSumOfTransactions1.mmObject();
		}

		@Override
		public Optional<NumberAndSumOfTransactions1> getValue(TotalTransactions6 obj) {
			return obj.getTotalDebitEntries();
		}

		@Override
		public void setValue(TotalTransactions6 obj, Optional<NumberAndSumOfTransactions1> value) {
			obj.setTotalDebitEntries(value.orElse(null));
		}
	};
	@XmlElement(name = "TtlNtriesPerBkTxCd")
	protected List<TotalsPerBankTransactionCode5> totalEntriesPerBankTransactionCode;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.TotalsPerBankTransactionCode5
	 * TotalsPerBankTransactionCode5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TotalTransactions6
	 * TotalTransactions6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlNtriesPerBkTxCd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalEntriesPerBankTransactionCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the total number and sum of entries per bank transaction code."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TotalTransactions6, List<TotalsPerBankTransactionCode5>> mmTotalEntriesPerBankTransactionCode = new MMMessageAssociationEnd<TotalTransactions6, List<TotalsPerBankTransactionCode5>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TotalTransactions6.mmObject();
			isDerived = false;
			xmlTag = "TtlNtriesPerBkTxCd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalEntriesPerBankTransactionCode";
			definition = "Specifies the total number and sum of entries per bank transaction code.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> TotalsPerBankTransactionCode5.mmObject();
		}

		@Override
		public List<TotalsPerBankTransactionCode5> getValue(TotalTransactions6 obj) {
			return obj.getTotalEntriesPerBankTransactionCode();
		}

		@Override
		public void setValue(TotalTransactions6 obj, List<TotalsPerBankTransactionCode5> value) {
			obj.setTotalEntriesPerBankTransactionCode(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TotalTransactions6.mmTotalEntries, com.tools20022.repository.msg.TotalTransactions6.mmTotalCreditEntries,
						com.tools20022.repository.msg.TotalTransactions6.mmTotalDebitEntries, com.tools20022.repository.msg.TotalTransactions6.mmTotalEntriesPerBankTransactionCode);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TotalTransactions6";
				definition = "Set of elements used to provide summary information on entries.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<NumberAndSumOfTransactions4> getTotalEntries() {
		return totalEntries == null ? Optional.empty() : Optional.of(totalEntries);
	}

	public TotalTransactions6 setTotalEntries(NumberAndSumOfTransactions4 totalEntries) {
		this.totalEntries = totalEntries;
		return this;
	}

	public Optional<NumberAndSumOfTransactions1> getTotalCreditEntries() {
		return totalCreditEntries == null ? Optional.empty() : Optional.of(totalCreditEntries);
	}

	public TotalTransactions6 setTotalCreditEntries(NumberAndSumOfTransactions1 totalCreditEntries) {
		this.totalCreditEntries = totalCreditEntries;
		return this;
	}

	public Optional<NumberAndSumOfTransactions1> getTotalDebitEntries() {
		return totalDebitEntries == null ? Optional.empty() : Optional.of(totalDebitEntries);
	}

	public TotalTransactions6 setTotalDebitEntries(NumberAndSumOfTransactions1 totalDebitEntries) {
		this.totalDebitEntries = totalDebitEntries;
		return this;
	}

	public List<TotalsPerBankTransactionCode5> getTotalEntriesPerBankTransactionCode() {
		return totalEntriesPerBankTransactionCode == null ? totalEntriesPerBankTransactionCode = new ArrayList<>() : totalEntriesPerBankTransactionCode;
	}

	public TotalTransactions6 setTotalEntriesPerBankTransactionCode(List<TotalsPerBankTransactionCode5> totalEntriesPerBankTransactionCode) {
		this.totalEntriesPerBankTransactionCode = Objects.requireNonNull(totalEntriesPerBankTransactionCode);
		return this;
	}
}