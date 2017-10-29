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
import com.tools20022.repository.codeset.BalanceAdjustmentType1Code;
import com.tools20022.repository.datatype.DecimalNumber;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max105Text;
import com.tools20022.repository.entity.CashBalance;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the balance adjustments for a specific service.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.BalanceAdjustment1#Type
 * BalanceAdjustment1.Type}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BalanceAdjustment1#Description
 * BalanceAdjustment1.Description}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BalanceAdjustment1#BalanceAmount
 * BalanceAdjustment1.BalanceAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BalanceAdjustment1#AverageAmount
 * BalanceAdjustment1.AverageAmount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BalanceAdjustment1#ErrorDate
 * BalanceAdjustment1.ErrorDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BalanceAdjustment1#PostingDate
 * BalanceAdjustment1.PostingDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BalanceAdjustment1#Days
 * BalanceAdjustment1.Days}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BalanceAdjustment1#EarningsAdjustmentAmount
 * BalanceAdjustment1.EarningsAdjustmentAmount}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CashBalance
 * CashBalance}</li>
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
 * "BalanceAdjustment1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the balance adjustments for a specific service."</li>
 * </ul>
 */
public class BalanceAdjustment1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Identifies the type of adjustment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceAdjustmentType1Code
	 * BalanceAdjustmentType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashBalance#BalanceAdjustmentCode
	 * CashBalance.BalanceAdjustmentCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BalanceAdjustment1
	 * BalanceAdjustment1}</li>
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
	 * definition} = "Identifies the type of adjustment."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute Type = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> BalanceAdjustment1.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CashBalance.BalanceAdjustmentCode;
			isDerived = false;
			xmlTag = "Tp";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Identifies the type of adjustment.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> BalanceAdjustmentType1Code.mmObject();
		}
	};
	/**
	 * Free-form description and clarification of the adjustment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max105Text
	 * Max105Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BalanceAdjustment1
	 * BalanceAdjustment1}</li>
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
	 * "Free-form description and clarification of the adjustment."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute Description = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> BalanceAdjustment1.mmObject();
			isDerived = false;
			xmlTag = "Desc";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Description";
			definition = "Free-form description and clarification of the adjustment.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max105Text.mmObject();
		}
	};
	/**
	 * Amount of the adjustment. If the amount would reduce the underlying
	 * balance then the amount should be negatively signed. Expressed in the
	 * Account currency.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountAndDirection34
	 * AmountAndDirection34}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashBalance#Amount
	 * CashBalance.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BalanceAdjustment1
	 * BalanceAdjustment1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BalAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of the adjustment. If the amount would reduce the underlying balance then the amount should be negatively signed. Expressed in the Account currency."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd BalanceAmount = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> BalanceAdjustment1.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CashBalance.Amount;
			isDerived = false;
			xmlTag = "BalAmt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceAmount";
			definition = "Amount of the adjustment. If the amount would reduce the underlying balance then the amount should be negatively signed. Expressed in the Account currency.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> AmountAndDirection34.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Day-weighted net amount of the adjustment to the average collected
	 * balance over the statement period.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountAndDirection34
	 * AmountAndDirection34}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashBalance#Amount
	 * CashBalance.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BalanceAdjustment1
	 * BalanceAdjustment1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AvrgAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AverageAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Day-weighted net amount of the adjustment to the average collected balance over the statement period."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd AverageAmount = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> BalanceAdjustment1.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CashBalance.Amount;
			isDerived = false;
			xmlTag = "AvrgAmt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AverageAmount";
			definition = "Day-weighted net amount of the adjustment to the average collected balance over the statement period.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> AmountAndDirection34.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Date on which the error occurred in the underlying cash account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BalanceAdjustment1
	 * BalanceAdjustment1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ErrDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ErrorDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which the error occurred in the underlying cash account."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute ErrorDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> BalanceAdjustment1.mmObject();
			isDerived = false;
			xmlTag = "ErrDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ErrorDate";
			definition = "Date on which the error occurred in the underlying cash account.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	/**
	 * Date on which the error was corrected in the cash account. If the date is
	 * not know then use the last day of the month in which the error was
	 * corrected.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Entry#EntryDate
	 * Entry.EntryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BalanceAdjustment1
	 * BalanceAdjustment1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PstngDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PostingDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which the error was corrected in the cash account. If the date is not know then use the last day of the month in which the error was corrected."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute PostingDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> BalanceAdjustment1.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Entry.EntryDate;
			isDerived = false;
			xmlTag = "PstngDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PostingDate";
			definition = "Date on which the error was corrected in the cash account. If the date is not know then use the last day of the month in which the error was corrected.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	/**
	 * Number of days within the period to which the adjustment applies.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.DecimalNumber
	 * DecimalNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#NumberOfDays
	 * DateTimePeriod.NumberOfDays}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BalanceAdjustment1
	 * BalanceAdjustment1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Days"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Days"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number of days within the period to which the adjustment applies."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute Days = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> BalanceAdjustment1.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.NumberOfDays;
			isDerived = false;
			xmlTag = "Days";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Days";
			definition = "Number of days within the period to which the adjustment applies.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}
	};
	/**
	 * Earnings credit adjustment, debit or credit, resulting from this
	 * adjustment’s effect on the average collected balance. If the amount would
	 * reduce the credit due then the amount should be negatively signed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountAndDirection34
	 * AmountAndDirection34}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Balance#Adjustment
	 * Balance.Adjustment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BalanceAdjustment1
	 * BalanceAdjustment1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EarngsAdjstmntAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EarningsAdjustmentAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Earnings credit adjustment, debit or credit, resulting from this adjustment’s effect on the average collected balance. If the amount would reduce the credit due then the amount should be negatively signed."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd EarningsAdjustmentAmount = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> BalanceAdjustment1.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Balance.Adjustment;
			isDerived = false;
			xmlTag = "EarngsAdjstmntAmt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EarningsAdjustmentAmount";
			definition = "Earnings credit adjustment, debit or credit, resulting from this adjustment’s effect on the average collected balance. If the amount would reduce the credit due then the amount should be negatively signed.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> AmountAndDirection34.mmObject();
			isComposite = true;
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.BalanceAdjustment1.Type, com.tools20022.repository.msg.BalanceAdjustment1.Description, com.tools20022.repository.msg.BalanceAdjustment1.BalanceAmount,
						com.tools20022.repository.msg.BalanceAdjustment1.AverageAmount, com.tools20022.repository.msg.BalanceAdjustment1.ErrorDate, com.tools20022.repository.msg.BalanceAdjustment1.PostingDate,
						com.tools20022.repository.msg.BalanceAdjustment1.Days, com.tools20022.repository.msg.BalanceAdjustment1.EarningsAdjustmentAmount);
				trace_lazy = () -> CashBalance.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "BalanceAdjustment1";
				definition = "Specifies the balance adjustments for a specific service.";
			}
		});
		return mmObject_lazy.get();
	}
}