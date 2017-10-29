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

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.BorrowingReasonCode;
import com.tools20022.repository.codeset.LendingTransactionMethodCode;
import com.tools20022.repository.codeset.ReversibleCode;
import com.tools20022.repository.codeset.SecuritiesLendingTypeCode;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.entity.SecuritiesFinancing;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Lending of securities by one party to another. The terms of the loan are
 * governed by an agreement that requires the borrower to provide the lender
 * with collateral of value equal to or greater than the loaned securities. As
 * payment for the loan, the parties negotiate a fee, quoted as an annualised
 * percentage of the value of the loaned securities.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="SecuritiesLending" src="doc-files/SecuritiesLending.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesLending#BorrowingFee
 * SecuritiesLending.BorrowingFee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesLending#CallableTradeIndicator
 * SecuritiesLending.CallableTradeIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesLending#LendingTransactionMethod
 * SecuritiesLending.LendingTransactionMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesLending#BorrowingReason
 * SecuritiesLending.BorrowingReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesLending#Reversible
 * SecuritiesLending.Reversible}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesLending#SecuritiesLendingType
 * SecuritiesLending.SecuritiesLendingType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesLending#LendingWithCollateral
 * SecuritiesLending.LendingWithCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesLending#MinimumDateForCallBack
 * SecuritiesLending.MinimumDateForCallBack}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesLending#NumberOfDaysLendingBorrowing
 * SecuritiesLending.NumberOfDaysLendingBorrowing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesLending#PeriodicPayment
 * SecuritiesLending.PeriodicPayment}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesLending#Rollover
 * SecuritiesLending.Rollover}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesLending#BorrowingRate
 * SecuritiesLending.BorrowingRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesLending#SecuritiesDeliveryObligation
 * SecuritiesLending.SecuritiesDeliveryObligation}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesDeliveryObligation#SecuritiesLending
 * SecuritiesDeliveryObligation.SecuritiesLending}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} =
 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing
 * SecuritiesFinancing}</li>
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
 * "SecuritiesLending"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Lending of securities by one party to another. The terms of the loan are governed by an agreement that requires the borrower to provide the lender with collateral of value equal to or greater than the loaned securities. As payment for the loan, the parties negotiate a fee, quoted as an annualised percentage of the value of the loaned securities."
 * </li>
 * </ul>
 */
public class SecuritiesLending extends SecuritiesFinancing {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Amount to be paid by the borrower to the lender for the securities
	 * borrowed calculated based on the bond loan rate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesLending
	 * SecuritiesLending}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BorrowingFee"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount to be paid by the borrower to the lender for the securities borrowed calculated based on the bond loan rate."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute BorrowingFee = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesLending.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BorrowingFee";
			definition = "Amount to be paid by the borrower to the lender for the securities borrowed calculated based on the bond loan rate.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Indicates whether the trade is callable or not.
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesLending
	 * SecuritiesLending}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CallableTradeIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the trade is callable or not."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CallableTradeIndicator = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesLending.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CallableTradeIndicator";
			definition = "Indicates whether the trade is callable or not.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Method applied to a lending transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.LendingTransactionMethodCode
	 * LendingTransactionMethodCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesLending
	 * SecuritiesLending}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LendingTransactionMethod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Method applied to a lending transaction."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute LendingTransactionMethod = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesLending.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LendingTransactionMethod";
			definition = "Method applied to a lending transaction.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> LendingTransactionMethodCode.mmObject();
		}
	};
	/**
	 * Underlying reason for the borrowing, for instance, sale on my behalf or
	 * on behalf of a third party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.BorrowingReasonCode
	 * BorrowingReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesLending
	 * SecuritiesLending}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BorrowingReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Underlying reason for the borrowing, for instance, sale on my behalf or on behalf of a third party."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute BorrowingReason = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesLending.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BorrowingReason";
			definition = "Underlying reason for the borrowing, for instance, sale on my behalf or on behalf of a third party.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> BorrowingReasonCode.mmObject();
		}
	};
	/**
	 * Indicates the possibility to terminate the securitiesc lending contract
	 * either by the borrower or lender before the expiration date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ReversibleCode
	 * ReversibleCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesLending
	 * SecuritiesLending}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reversible"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the possibility to terminate the securitiesc lending contract either by the borrower or lender before the expiration date."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Reversible = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesLending.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Reversible";
			definition = "Indicates the possibility to terminate the securitiesc lending contract either by the borrower or lender before the expiration date.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ReversibleCode.mmObject();
		}
	};
	/**
	 * Type of securities lending.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesLendingTypeCode
	 * SecuritiesLendingTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesLending
	 * SecuritiesLending}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesLendingType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of securities lending."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute SecuritiesLendingType = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesLending.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesLendingType";
			definition = "Type of securities lending.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> SecuritiesLendingTypeCode.mmObject();
		}
	};
	/**
	 * Indicates if the contract is with or without an exchange of collateral.
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesLending
	 * SecuritiesLending}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LendingWithCollateral"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates if the contract is with or without an exchange of collateral."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute LendingWithCollateral = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesLending.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LendingWithCollateral";
			definition = "Indicates if the contract is with or without an exchange of collateral.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Minimum date at which the borrower is allowed to give back the
	 * securities.
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesLending
	 * SecuritiesLending}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumDateForCallBack"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Minimum date at which the borrower is allowed to give back the securities."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute MinimumDateForCallBack = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesLending.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MinimumDateForCallBack";
			definition = "Minimum date at which the borrower is allowed to give back the securities.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	/**
	 * Number of days the securities are lent or borrowed for a contract which
	 * has an agreed closing date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max4NumericText
	 * Max4NumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesLending
	 * SecuritiesLending}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NumberOfDaysLendingBorrowing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number of days the securities are lent or borrowed for a contract which has an agreed closing date."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute NumberOfDaysLendingBorrowing = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesLending.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NumberOfDaysLendingBorrowing";
			definition = "Number of days the securities are lent or borrowed for a contract which has an agreed closing date.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max4NumericText.mmObject();
		}
	};
	/**
	 * Indicates whether the securities lending fees can be paid periodically or
	 * at the end of the contract.
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesLending
	 * SecuritiesLending}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PeriodicPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the securities lending fees can be paid periodically or at the end of the contract."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute PeriodicPayment = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesLending.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PeriodicPayment";
			definition = "Indicates whether the securities lending fees can be paid periodically or at the end of the contract.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Indicates that the contract can be rolled over.
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesLending
	 * SecuritiesLending}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rollover"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates that the contract can be rolled over."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Rollover = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesLending.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Rollover";
			definition = "Indicates that the contract can be rolled over.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Rate paid by the borrower to the lender for the securities borrowed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesLending
	 * SecuritiesLending}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BorrowingRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Rate paid by the borrower to the lender for the securities borrowed."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute BorrowingRate = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesLending.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BorrowingRate";
			definition = "Rate paid by the borrower to the lender for the securities borrowed.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Obligation covered by the lending of securities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesDeliveryObligation#SecuritiesLending
	 * SecuritiesDeliveryObligation.SecuritiesLending}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesDeliveryObligation
	 * SecuritiesDeliveryObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesLending
	 * SecuritiesLending}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesDeliveryObligation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Obligation covered by the lending of securities."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SecuritiesDeliveryObligation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesLending.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesDeliveryObligation";
			definition = "Obligation covered by the lending of securities.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesDeliveryObligation.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesDeliveryObligation.SecuritiesLending;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SecuritiesLending";
				definition = "Lending of securities by one party to another. The terms of the loan are governed by an agreement that requires the borrower to provide the lender with collateral of value equal to or greater than the loaned securities. As payment for the loan, the parties negotiate a fee, quoted as an annualised percentage of the value of the loaned securities.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesDeliveryObligation.SecuritiesLending);
				superType_lazy = () -> SecuritiesFinancing.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesLending.BorrowingFee, com.tools20022.repository.entity.SecuritiesLending.CallableTradeIndicator,
						com.tools20022.repository.entity.SecuritiesLending.LendingTransactionMethod, com.tools20022.repository.entity.SecuritiesLending.BorrowingReason, com.tools20022.repository.entity.SecuritiesLending.Reversible,
						com.tools20022.repository.entity.SecuritiesLending.SecuritiesLendingType, com.tools20022.repository.entity.SecuritiesLending.LendingWithCollateral,
						com.tools20022.repository.entity.SecuritiesLending.MinimumDateForCallBack, com.tools20022.repository.entity.SecuritiesLending.NumberOfDaysLendingBorrowing,
						com.tools20022.repository.entity.SecuritiesLending.PeriodicPayment, com.tools20022.repository.entity.SecuritiesLending.Rollover, com.tools20022.repository.entity.SecuritiesLending.BorrowingRate,
						com.tools20022.repository.entity.SecuritiesLending.SecuritiesDeliveryObligation);
			}
		});
		return mmObject_lazy.get();
	}
}