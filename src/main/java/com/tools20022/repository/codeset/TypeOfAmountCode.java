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

package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Identification or qualification of the type of amount.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.TypeOfAmountCode#Cashback
 * TypeOfAmountCode.Cashback}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TypeOfAmountCode#Gratuity
 * TypeOfAmountCode.Gratuity}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TypeOfAmountCode#Fees
 * TypeOfAmountCode.Fees}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TypeOfAmountCode#Rebates
 * TypeOfAmountCode.Rebates}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TypeOfAmountCode#ValueAddedTax
 * TypeOfAmountCode.ValueAddedTax}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TypeOfAmountCode#Actual
 * TypeOfAmountCode.Actual}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TypeOfAmountCode#Replacement
 * TypeOfAmountCode.Replacement}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TypeOfAmountCode#Maximum
 * TypeOfAmountCode.Maximum}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TypeOfAmountCode#Default
 * TypeOfAmountCode.Default}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TypeOfAmountCode#Estimated
 * TypeOfAmountCode.Estimated}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TypeOfAmountCode#Original
 * TypeOfAmountCode.Original}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TypeOfAmountCode#Surcharge
 * TypeOfAmountCode.Surcharge}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TypeOfAmountCode#ServiceFee
 * TypeOfAmountCode.ServiceFee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TypeOfAmountCode#InterchangeFee
 * TypeOfAmountCode.InterchangeFee}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TypeOfAmountCode#Discount
 * TypeOfAmountCode.Discount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TypeOfAmountCode#ATMCommissionFee
 * TypeOfAmountCode.ATMCommissionFee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TypeOfAmountCode#AuthorisedAmount
 * TypeOfAmountCode.AuthorisedAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TypeOfAmountCode#CardRemainingBalance
 * TypeOfAmountCode.CardRemainingBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TypeOfAmountCode#MaximumAllowedAmount
 * TypeOfAmountCode.MaximumAllowedAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TypeOfAmountCode#MinimumAllowedAmount
 * TypeOfAmountCode.MinimumAllowedAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TypeOfAmountCode#RequestedAmount
 * TypeOfAmountCode.RequestedAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TypeOfAmountCode#IssuerFees
 * TypeOfAmountCode.IssuerFees}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TypeOfAmountCode#IssuerCommission
 * TypeOfAmountCode.IssuerCommission}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TypeOfAmountCode#InterchangeFees
 * TypeOfAmountCode.InterchangeFees}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TypeOfAmountCode#ProcessingFees
 * TypeOfAmountCode.ProcessingFees}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TypeOfAmountCode#CurrencyConversionFees
 * TypeOfAmountCode.CurrencyConversionFees}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TypeOfAmountCode#InternationalServiceAssessmentFees
 * TypeOfAmountCode.InternationalServiceAssessmentFees}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TypeOfAmountCode#Commission
 * TypeOfAmountCode.Commission}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TypeOfAmountCode#Donation
 * TypeOfAmountCode.Donation}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TypeOfAmountCode#Tax
 * TypeOfAmountCode.Tax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TypeOfAmountCode#Incremental
 * TypeOfAmountCode.Incremental}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TypeOfAmountCode#Decremental
 * TypeOfAmountCode.Decremental}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TypeOfAmountCode#Reserved
 * TypeOfAmountCode.Reserved}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"CSHB"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TypeOfAmountCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Identification or qualification of the type of amount."</li>
 * </ul>
 */
public class TypeOfAmountCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Cash-back amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfAmountCode
	 * TypeOfAmountCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CSHB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Cashback"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Cash-back amount."</li>
	 * </ul>
	 */
	public static final MMCode Cashback = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Cashback";
			definition = "Cash-back amount.";
			owner_lazy = () -> TypeOfAmountCode.mmObject();
			codeName = "CSHB";
		}
	};
	/**
	 * Gratuity amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfAmountCode
	 * TypeOfAmountCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "GRTY"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Gratuity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Gratuity amount."</li>
	 * </ul>
	 */
	public static final MMCode Gratuity = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Gratuity";
			definition = "Gratuity amount.";
			owner_lazy = () -> TypeOfAmountCode.mmObject();
			codeName = "GRTY";
		}
	};
	/**
	 * Fees.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfAmountCode
	 * TypeOfAmountCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FEES"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Fees"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Fees."</li>
	 * </ul>
	 */
	public static final MMCode Fees = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Fees";
			definition = "Fees.";
			owner_lazy = () -> TypeOfAmountCode.mmObject();
			codeName = "FEES";
		}
	};
	/**
	 * Global rebate of the transaction. This amount is counted as a negative
	 * amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfAmountCode
	 * TypeOfAmountCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RBTS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rebates"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Global rebate of the transaction. This amount is counted as a negative amount."
	 * </li>
	 * </ul>
	 */
	public static final MMCode Rebates = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Rebates";
			definition = "Global rebate of the transaction. This amount is counted as a negative amount.";
			owner_lazy = () -> TypeOfAmountCode.mmObject();
			codeName = "RBTS";
		}
	};
	/**
	 * Value added tax amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfAmountCode
	 * TypeOfAmountCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "VATX"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValueAddedTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Value added tax amount."</li>
	 * </ul>
	 */
	public static final MMCode ValueAddedTax = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ValueAddedTax";
			definition = "Value added tax amount.";
			owner_lazy = () -> TypeOfAmountCode.mmObject();
			codeName = "VATX";
		}
	};
	/**
	 * Actual amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfAmountCode
	 * TypeOfAmountCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ACTL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Actual"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Actual amount."</li>
	 * </ul>
	 */
	public static final MMCode Actual = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Actual";
			definition = "Actual amount.";
			owner_lazy = () -> TypeOfAmountCode.mmObject();
			codeName = "ACTL";
		}
	};
	/**
	 * Replacement amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfAmountCode
	 * TypeOfAmountCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RPLT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Replacement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Replacement amount."</li>
	 * </ul>
	 */
	public static final MMCode Replacement = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Replacement";
			definition = "Replacement amount.";
			owner_lazy = () -> TypeOfAmountCode.mmObject();
			codeName = "RPLT";
		}
	};
	/**
	 * Maximum amount (the final amount must be less or equal).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfAmountCode
	 * TypeOfAmountCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MAXI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Maximum"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Maximum amount (the final amount must be less or equal)."</li>
	 * </ul>
	 */
	public static final MMCode Maximum = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Maximum";
			definition = "Maximum amount (the final amount must be less or equal).";
			owner_lazy = () -> TypeOfAmountCode.mmObject();
			codeName = "MAXI";
		}
	};
	/**
	 * Default amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfAmountCode
	 * TypeOfAmountCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DFLT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Default"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Default amount."</li>
	 * </ul>
	 */
	public static final MMCode Default = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Default";
			definition = "Default amount.";
			owner_lazy = () -> TypeOfAmountCode.mmObject();
			codeName = "DFLT";
		}
	};
	/**
	 * Estimated amount (the final amount could be above or below).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfAmountCode
	 * TypeOfAmountCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ESTM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Estimated"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Estimated amount (the final amount could be above or below)."</li>
	 * </ul>
	 */
	public static final MMCode Estimated = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Estimated";
			definition = "Estimated amount (the final amount could be above or below).";
			owner_lazy = () -> TypeOfAmountCode.mmObject();
			codeName = "ESTM";
		}
	};
	/**
	 * Original amount authorised during the real-time authorisation process.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfAmountCode
	 * TypeOfAmountCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ORIG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Original"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Original amount authorised during the real-time authorisation process."</li>
	 * </ul>
	 */
	public static final MMCode Original = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Original";
			definition = "Original amount authorised during the real-time authorisation process.";
			owner_lazy = () -> TypeOfAmountCode.mmObject();
			codeName = "ORIG";
		}
	};
	/**
	 * Extra fee for a purchase or a withdrawal.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfAmountCode
	 * TypeOfAmountCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SRCH"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Surcharge"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Extra fee for a purchase or a withdrawal."</li>
	 * </ul>
	 */
	public static final MMCode Surcharge = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Surcharge";
			definition = "Extra fee for a purchase or a withdrawal.";
			owner_lazy = () -> TypeOfAmountCode.mmObject();
			codeName = "SRCH";
		}
	};
	/**
	 * Service fee.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfAmountCode
	 * TypeOfAmountCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SRVF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ServiceFee"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Service fee."</li>
	 * </ul>
	 */
	public static final MMCode ServiceFee = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ServiceFee";
			definition = "Service fee.";
			owner_lazy = () -> TypeOfAmountCode.mmObject();
			codeName = "SRVF";
		}
	};
	/**
	 * Interchange fee.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfAmountCode
	 * TypeOfAmountCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INTC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterchangeFee"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Interchange fee."</li>
	 * </ul>
	 */
	public static final MMCode InterchangeFee = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InterchangeFee";
			definition = "Interchange fee.";
			owner_lazy = () -> TypeOfAmountCode.mmObject();
			codeName = "INTC";
		}
	};
	/**
	 * Discount, rebate or voucher, related to loyalty programs. This amount is
	 * counted as a negative amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfAmountCode
	 * TypeOfAmountCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DCNT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Discount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Discount, rebate or voucher, related to loyalty programs. This amount is counted as a negative amount."
	 * </li>
	 * </ul>
	 */
	public static final MMCode Discount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Discount";
			definition = "Discount, rebate or voucher, related to loyalty programs. This amount is counted as a negative amount.";
			owner_lazy = () -> TypeOfAmountCode.mmObject();
			codeName = "DCNT";
		}
	};
	/**
	 * Commission that the issuer will charge to the cardholder, which should be
	 * shown and accepted by the cardholder before the money is disbursed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfAmountCode
	 * TypeOfAmountCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ATMF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ATMCommissionFee"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Commission that the issuer will charge to the cardholder, which should be shown and accepted by the cardholder before the money is disbursed."
	 * </li>
	 * </ul>
	 */
	public static final MMCode ATMCommissionFee = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMCommissionFee";
			definition = "Commission that the issuer will charge to the cardholder, which should be shown and accepted by the cardholder before the money is disbursed.";
			owner_lazy = () -> TypeOfAmountCode.mmObject();
			codeName = "ATMF";
		}
	};
	/**
	 * Transaction amount that has been authorised.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfAmountCode
	 * TypeOfAmountCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AMTH"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AuthorisedAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction amount that has been authorised."</li>
	 * </ul>
	 */
	public static final MMCode AuthorisedAmount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AuthorisedAmount";
			definition = "Transaction amount that has been authorised.";
			owner_lazy = () -> TypeOfAmountCode.mmObject();
			codeName = "AMTH";
		}
	};
	/**
	 * Remaining allowed amount for this type of transaction with this card,
	 * after the transaction, until the end of the card limit period.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfAmountCode
	 * TypeOfAmountCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CRDB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardRemainingBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Remaining allowed amount for this type of transaction with this card, after the transaction, until the end of the card limit period."
	 * </li>
	 * </ul>
	 */
	public static final MMCode CardRemainingBalance = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardRemainingBalance";
			definition = "Remaining allowed amount for this type of transaction with this card, after the transaction, until the end of the card limit period.";
			owner_lazy = () -> TypeOfAmountCode.mmObject();
			codeName = "CRDB";
		}
	};
	/**
	 * Maximum amount allowed for the transaction in the transaction amount
	 * currency if the transaction amount of the request was declined.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfAmountCode
	 * TypeOfAmountCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AMTX"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaximumAllowedAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Maximum amount allowed for the transaction in the transaction amount currency if the transaction amount of the request was declined."
	 * </li>
	 * </ul>
	 */
	public static final MMCode MaximumAllowedAmount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaximumAllowedAmount";
			definition = "Maximum amount allowed for the transaction in the transaction amount currency if the transaction amount of the request was declined.";
			owner_lazy = () -> TypeOfAmountCode.mmObject();
			codeName = "AMTX";
		}
	};
	/**
	 * Minimum amount allowed in the TransactionAmount currency if the
	 * transaction amount of the request was declined.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfAmountCode
	 * TypeOfAmountCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AMTN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumAllowedAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Minimum amount allowed in the TransactionAmount currency if the transaction amount of the request was declined."
	 * </li>
	 * </ul>
	 */
	public static final MMCode MinimumAllowedAmount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MinimumAllowedAmount";
			definition = "Minimum amount allowed in the TransactionAmount currency if the transaction amount of the request was declined.";
			owner_lazy = () -> TypeOfAmountCode.mmObject();
			codeName = "AMTN";
		}
	};
	/**
	 * Transaction amount that has been requested to be authorised.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfAmountCode
	 * TypeOfAmountCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AMTQ"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction amount that has been requested to be authorised."</li>
	 * </ul>
	 */
	public static final MMCode RequestedAmount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedAmount";
			definition = "Transaction amount that has been requested to be authorised.";
			owner_lazy = () -> TypeOfAmountCode.mmObject();
			codeName = "AMTQ";
		}
	};
	/**
	 * Fees amount from the card issuer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfAmountCode
	 * TypeOfAmountCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FEEI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerFees"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Fees amount from the card issuer."</li>
	 * </ul>
	 */
	public static final MMCode IssuerFees = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerFees";
			definition = "Fees amount from the card issuer.";
			owner_lazy = () -> TypeOfAmountCode.mmObject();
			codeName = "FEEI";
		}
	};
	/**
	 * Commission from the card issuer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfAmountCode
	 * TypeOfAmountCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "COMI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerCommission"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Commission from the card issuer."</li>
	 * </ul>
	 */
	public static final MMCode IssuerCommission = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerCommission";
			definition = "Commission from the card issuer.";
			owner_lazy = () -> TypeOfAmountCode.mmObject();
			codeName = "COMI";
		}
	};
	/**
	 * Interchange fees.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfAmountCode
	 * TypeOfAmountCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FEEH"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterchangeFees"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Interchange fees."</li>
	 * </ul>
	 */
	public static final MMCode InterchangeFees = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterchangeFees";
			definition = "Interchange fees.";
			owner_lazy = () -> TypeOfAmountCode.mmObject();
			codeName = "FEEH";
		}
	};
	/**
	 * Processing fees.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfAmountCode
	 * TypeOfAmountCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FEEP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProcessingFees"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Processing fees."</li>
	 * </ul>
	 */
	public static final MMCode ProcessingFees = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProcessingFees";
			definition = "Processing fees.";
			owner_lazy = () -> TypeOfAmountCode.mmObject();
			codeName = "FEEP";
		}
	};
	/**
	 * Currency conversion fees.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfAmountCode
	 * TypeOfAmountCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FEEC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyConversionFees"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Currency conversion fees."</li>
	 * </ul>
	 */
	public static final MMCode CurrencyConversionFees = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrencyConversionFees";
			definition = "Currency conversion fees.";
			owner_lazy = () -> TypeOfAmountCode.mmObject();
			codeName = "FEEC";
		}
	};
	/**
	 * International service assessment fees.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfAmountCode
	 * TypeOfAmountCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FEEA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InternationalServiceAssessmentFees"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "International  service assessment fees."</li>
	 * </ul>
	 */
	public static final MMCode InternationalServiceAssessmentFees = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InternationalServiceAssessmentFees";
			definition = "International  service assessment fees.";
			owner_lazy = () -> TypeOfAmountCode.mmObject();
			codeName = "FEEA";
		}
	};
	/**
	 * Commission, for example for DCC (Dynamic Currency Conversion)
	 * transactions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfAmountCode
	 * TypeOfAmountCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "COMM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Commission"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Commission, for example for DCC (Dynamic Currency Conversion) transactions."
	 * </li>
	 * </ul>
	 */
	public static final MMCode Commission = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Commission";
			definition = "Commission, for example for DCC (Dynamic Currency Conversion) transactions.";
			owner_lazy = () -> TypeOfAmountCode.mmObject();
			codeName = "COMM";
		}
	};
	/**
	 * Donation amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfAmountCode
	 * TypeOfAmountCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DONN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Donation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Donation amount."</li>
	 * </ul>
	 */
	public static final MMCode Donation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Donation";
			definition = "Donation amount.";
			owner_lazy = () -> TypeOfAmountCode.mmObject();
			codeName = "DONN";
		}
	};
	/**
	 * Taxes applicable to the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfAmountCode
	 * TypeOfAmountCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TAXT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Tax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Taxes applicable to the transaction."</li>
	 * </ul>
	 */
	public static final MMCode Tax = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Tax";
			definition = "Taxes applicable to the transaction.";
			owner_lazy = () -> TypeOfAmountCode.mmObject();
			codeName = "TAXT";
		}
	};
	/**
	 * Incremental amount for reservation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfAmountCode
	 * TypeOfAmountCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INCR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Incremental"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Incremental amount for reservation."</li>
	 * </ul>
	 */
	public static final MMCode Incremental = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Incremental";
			definition = "Incremental amount for reservation.";
			owner_lazy = () -> TypeOfAmountCode.mmObject();
			codeName = "INCR";
		}
	};
	/**
	 * Decremental amount for reservation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfAmountCode
	 * TypeOfAmountCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DECR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Decremental"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Decremental amount for reservation."</li>
	 * </ul>
	 */
	public static final MMCode Decremental = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Decremental";
			definition = "Decremental amount for reservation.";
			owner_lazy = () -> TypeOfAmountCode.mmObject();
			codeName = "DECR";
		}
	};
	/**
	 * Reserved or updated reserved amount for reservation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfAmountCode
	 * TypeOfAmountCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RESD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reserved"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reserved or updated reserved amount for reservation."</li>
	 * </ul>
	 */
	public static final MMCode Reserved = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reserved";
			definition = "Reserved or updated reserved amount for reservation.";
			owner_lazy = () -> TypeOfAmountCode.mmObject();
			codeName = "RESD";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("CSHB");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "TypeOfAmountCode";
				definition = "Identification or qualification of the type of amount.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TypeOfAmountCode.Cashback, com.tools20022.repository.codeset.TypeOfAmountCode.Gratuity, com.tools20022.repository.codeset.TypeOfAmountCode.Fees,
						com.tools20022.repository.codeset.TypeOfAmountCode.Rebates, com.tools20022.repository.codeset.TypeOfAmountCode.ValueAddedTax, com.tools20022.repository.codeset.TypeOfAmountCode.Actual,
						com.tools20022.repository.codeset.TypeOfAmountCode.Replacement, com.tools20022.repository.codeset.TypeOfAmountCode.Maximum, com.tools20022.repository.codeset.TypeOfAmountCode.Default,
						com.tools20022.repository.codeset.TypeOfAmountCode.Estimated, com.tools20022.repository.codeset.TypeOfAmountCode.Original, com.tools20022.repository.codeset.TypeOfAmountCode.Surcharge,
						com.tools20022.repository.codeset.TypeOfAmountCode.ServiceFee, com.tools20022.repository.codeset.TypeOfAmountCode.InterchangeFee, com.tools20022.repository.codeset.TypeOfAmountCode.Discount,
						com.tools20022.repository.codeset.TypeOfAmountCode.ATMCommissionFee, com.tools20022.repository.codeset.TypeOfAmountCode.AuthorisedAmount, com.tools20022.repository.codeset.TypeOfAmountCode.CardRemainingBalance,
						com.tools20022.repository.codeset.TypeOfAmountCode.MaximumAllowedAmount, com.tools20022.repository.codeset.TypeOfAmountCode.MinimumAllowedAmount, com.tools20022.repository.codeset.TypeOfAmountCode.RequestedAmount,
						com.tools20022.repository.codeset.TypeOfAmountCode.IssuerFees, com.tools20022.repository.codeset.TypeOfAmountCode.IssuerCommission, com.tools20022.repository.codeset.TypeOfAmountCode.InterchangeFees,
						com.tools20022.repository.codeset.TypeOfAmountCode.ProcessingFees, com.tools20022.repository.codeset.TypeOfAmountCode.CurrencyConversionFees,
						com.tools20022.repository.codeset.TypeOfAmountCode.InternationalServiceAssessmentFees, com.tools20022.repository.codeset.TypeOfAmountCode.Commission, com.tools20022.repository.codeset.TypeOfAmountCode.Donation,
						com.tools20022.repository.codeset.TypeOfAmountCode.Tax, com.tools20022.repository.codeset.TypeOfAmountCode.Incremental, com.tools20022.repository.codeset.TypeOfAmountCode.Decremental,
						com.tools20022.repository.codeset.TypeOfAmountCode.Reserved);
			}
		});
		return mmObject_lazy.get();
	}
}