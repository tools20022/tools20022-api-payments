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
 * Collateral position is available for other purposes (for example, onwards
 * delivery).
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionCode#PartialAllowed
 * SettlementTransactionConditionCode.PartialAllowed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionCode#PartialNotAllowed
 * SettlementTransactionConditionCode.PartialNotAllowed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionCode#PartialSettlementCashThresholdAllowed
 * SettlementTransactionConditionCode.PartialSettlementCashThresholdAllowed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionCode#PartialSettlementQuantityThresholdAllowed
 * SettlementTransactionConditionCode.PartialSettlementQuantityThresholdAllowed}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionCode#Assignement
 * SettlementTransactionConditionCode.Assignement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionCode#BuytoCover
 * SettlementTransactionConditionCode.BuytoCover}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionCode#Clean
 * SettlementTransactionConditionCode.Clean}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionCode#Dirty
 * SettlementTransactionConditionCode.Dirty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionCode#DeliveryWithoutMatching
 * SettlementTransactionConditionCode.DeliveryWithoutMatching}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionCode#Drawn
 * SettlementTransactionConditionCode.Drawn}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionCode#Exercised
 * SettlementTransactionConditionCode.Exercised}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionCode#FreeCleanSettlement
 * SettlementTransactionConditionCode.FreeCleanSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionCode#KnockedOut
 * SettlementTransactionConditionCode.KnockedOut}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionCode#Physical
 * SettlementTransactionConditionCode.Physical}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionCode#Residual
 * SettlementTransactionConditionCode.Residual}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionCode#ShortSell
 * SettlementTransactionConditionCode.ShortSell}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionCode#SplitCurrencySettlement
 * SettlementTransactionConditionCode.SplitCurrencySettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionCode#SpecialDelivery
 * SettlementTransactionConditionCode.SpecialDelivery}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionCode#SplitSettlement
 * SettlementTransactionConditionCode.SplitSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionCode#Unexposed
 * SettlementTransactionConditionCode.Unexposed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionCode#Expired
 * SettlementTransactionConditionCode.Expired}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionCode#PendingSale
 * SettlementTransactionConditionCode.PendingSale}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionCode#TripartySegregation
 * SettlementTransactionConditionCode.TripartySegregation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionCode#NoAutomaticMarketClaim
 * SettlementTransactionConditionCode.NoAutomaticMarketClaim}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionCode#Transformation
 * SettlementTransactionConditionCode.Transformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionCode#Rehypothecation
 * SettlementTransactionConditionCode.Rehypothecation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionCode#AcceptAfterRegularSettlementDeadline
 * SettlementTransactionConditionCode.AcceptAfterRegularSettlementDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionCode#Reporting
 * SettlementTransactionConditionCode.Reporting}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionCode#NotAccountingRelated
 * SettlementTransactionConditionCode.NotAccountingRelated}</li>
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
 * <li>"PART"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SettlementTransactionConditionCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Collateral position is available for other purposes (for example, onwards delivery)."
 * </li>
 * </ul>
 */
public class SettlementTransactionConditionCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Partial settlement is allowed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionCode
	 * SettlementTransactionConditionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PART"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialAllowed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Partial settlement is allowed."</li>
	 * </ul>
	 */
	public static final MMCode PartialAllowed = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PartialAllowed";
			definition = "Partial settlement is allowed.";
			owner_lazy = () -> SettlementTransactionConditionCode.mmObject();
			codeName = "PART";
		}
	};
	/**
	 * Partial settlement is not allowed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionCode
	 * SettlementTransactionConditionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NPAR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialNotAllowed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Partial settlement is not allowed."</li>
	 * </ul>
	 */
	public static final MMCode PartialNotAllowed = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PartialNotAllowed";
			definition = "Partial settlement is not allowed.";
			owner_lazy = () -> SettlementTransactionConditionCode.mmObject();
			codeName = "NPAR";
		}
	};
	/**
	 * Partial settlement is allowed but must satisfy a cash value minimum
	 * (value defined in static data).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionCode
	 * SettlementTransactionConditionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PARC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialSettlementCashThresholdAllowed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Partial settlement is  allowed but must satisfy a cash value minimum (value defined in static data)."
	 * </li>
	 * </ul>
	 */
	public static final MMCode PartialSettlementCashThresholdAllowed = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PartialSettlementCashThresholdAllowed";
			definition = "Partial settlement is  allowed but must satisfy a cash value minimum (value defined in static data).";
			owner_lazy = () -> SettlementTransactionConditionCode.mmObject();
			codeName = "PARC";
		}
	};
	/**
	 * Partial settlement is allowed but must satisfy a minimum quantity of
	 * securities (quantity defined in static data).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionCode
	 * SettlementTransactionConditionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PARQ"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialSettlementQuantityThresholdAllowed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Partial settlement is allowed but must satisfy a minimum quantity of securities (quantity defined in static data)."
	 * </li>
	 * </ul>
	 */
	public static final MMCode PartialSettlementQuantityThresholdAllowed = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PartialSettlementQuantityThresholdAllowed";
			definition = "Partial settlement is allowed but must satisfy a minimum quantity of securities (quantity defined in static data).";
			owner_lazy = () -> SettlementTransactionConditionCode.mmObject();
			codeName = "PARQ";
		}
	};
	/**
	 * Transfer of ownership of the asset to another party during the closing of
	 * an option.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionCode
	 * SettlementTransactionConditionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ASGN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Assignement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transfer of ownership of the asset to another party during the closing of an option."
	 * </li>
	 * </ul>
	 */
	public static final MMCode Assignement = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Assignement";
			definition = "Transfer of ownership of the asset to another party during the closing of an option.";
			owner_lazy = () -> SettlementTransactionConditionCode.mmObject();
			codeName = "ASGN";
		}
	};
	/**
	 * Transaction is a buy to cover.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionCode
	 * SettlementTransactionConditionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BUTC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BuytoCover"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is a buy to cover."</li>
	 * </ul>
	 */
	public static final MMCode BuytoCover = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BuytoCover";
			definition = "Transaction is a buy to cover.";
			owner_lazy = () -> SettlementTransactionConditionCode.mmObject();
			codeName = "BUTC";
		}
	};
	/**
	 * Tax-exempt financial instruments are to be settled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionCode
	 * SettlementTransactionConditionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CLEN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Clean"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Tax-exempt financial instruments are to be settled."</li>
	 * </ul>
	 */
	public static final MMCode Clean = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Clean";
			definition = "Tax-exempt financial instruments are to be settled.";
			owner_lazy = () -> SettlementTransactionConditionCode.mmObject();
			codeName = "CLEN";
		}
	};
	/**
	 * Taxable financial instruments are to be settled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionCode
	 * SettlementTransactionConditionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DIRT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Dirty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Taxable financial instruments are to be settled."</li>
	 * </ul>
	 */
	public static final MMCode Dirty = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Dirty";
			definition = "Taxable financial instruments are to be settled.";
			owner_lazy = () -> SettlementTransactionConditionCode.mmObject();
			codeName = "DIRT";
		}
	};
	/**
	 * Matching receipt instruction not required (only for concerned
	 * international or national central securities depositories).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionCode
	 * SettlementTransactionConditionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DLWM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliveryWithoutMatching"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Matching receipt instruction not required (only for concerned international or national central securities depositories)."
	 * </li>
	 * </ul>
	 */
	public static final MMCode DeliveryWithoutMatching = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DeliveryWithoutMatching";
			definition = "Matching receipt instruction not required (only for concerned international or national central securities depositories).";
			owner_lazy = () -> SettlementTransactionConditionCode.mmObject();
			codeName = "DLWM";
		}
	};
	/**
	 * Settlement transactions relates to drawn securities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionCode
	 * SettlementTransactionConditionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DRAW"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Drawn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Settlement transactions relates to drawn securities."</li>
	 * </ul>
	 */
	public static final MMCode Drawn = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Drawn";
			definition = "Settlement transactions relates to drawn securities.";
			owner_lazy = () -> SettlementTransactionConditionCode.mmObject();
			codeName = "DRAW";
		}
	};
	/**
	 * Settlement transaction relates to options, futures or derivatives that
	 * are exercised.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionCode
	 * SettlementTransactionConditionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EXER"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Exercised"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Settlement transaction relates to options, futures or derivatives that are exercised."
	 * </li>
	 * </ul>
	 */
	public static final MMCode Exercised = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Exercised";
			definition = "Settlement transaction relates to options, futures or derivatives that are exercised.";
			owner_lazy = () -> SettlementTransactionConditionCode.mmObject();
			codeName = "EXER";
		}
	};
	/**
	 * Delivery will be made free of payment but a clean payment order will be
	 * sent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionCode
	 * SettlementTransactionConditionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FRCL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FreeCleanSettlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Delivery will be made free of payment but a clean payment order will be sent."
	 * </li>
	 * </ul>
	 */
	public static final MMCode FreeCleanSettlement = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FreeCleanSettlement";
			definition = "Delivery will be made free of payment but a clean payment order will be sent.";
			owner_lazy = () -> SettlementTransactionConditionCode.mmObject();
			codeName = "FRCL";
		}
	};
	/**
	 * Settlement transaction relates to options, futures or derivatives that
	 * are expired worthless.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionCode
	 * SettlementTransactionConditionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "KNOC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "KnockedOut"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Settlement transaction relates to options, futures or derivatives that are expired worthless."
	 * </li>
	 * </ul>
	 */
	public static final MMCode KnockedOut = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "KnockedOut";
			definition = "Settlement transaction relates to options, futures or derivatives that are expired worthless.";
			owner_lazy = () -> SettlementTransactionConditionCode.mmObject();
			codeName = "KNOC";
		}
	};
	/**
	 * Securities are to be physically settled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionCode
	 * SettlementTransactionConditionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PHYS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Physical"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Securities are to be physically settled."</li>
	 * </ul>
	 */
	public static final MMCode Physical = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Physical";
			definition = "Securities are to be physically settled.";
			owner_lazy = () -> SettlementTransactionConditionCode.mmObject();
			codeName = "PHYS";
		}
	};
	/**
	 * Relates to transaction on a security that is not eligible at the Central
	 * Security Depository (CSD) but for which the payment will be enacted by
	 * the central securities depository.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionCode
	 * SettlementTransactionConditionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RESI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Residual"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Relates to transaction on a security that is not eligible at the Central Security Depository (CSD) but for which the payment will be enacted by the central securities depository."
	 * </li>
	 * </ul>
	 */
	public static final MMCode Residual = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Residual";
			definition = "Relates to transaction on a security that is not eligible at the Central Security Depository (CSD) but for which the payment will be enacted by the central securities depository.";
			owner_lazy = () -> SettlementTransactionConditionCode.mmObject();
			codeName = "RESI";
		}
	};
	/**
	 * Account is used for short sale orders.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionCode
	 * SettlementTransactionConditionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SHOR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ShortSell"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account is used for short sale orders."</li>
	 * </ul>
	 */
	public static final MMCode ShortSell = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ShortSell";
			definition = "Account is used for short sale orders.";
			owner_lazy = () -> SettlementTransactionConditionCode.mmObject();
			codeName = "SHOR";
		}
	};
	/**
	 * Settlement is in two different currencies.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionCode
	 * SettlementTransactionConditionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SPCS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SplitCurrencySettlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Settlement is in two different currencies."</li>
	 * </ul>
	 */
	public static final MMCode SplitCurrencySettlement = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SplitCurrencySettlement";
			definition = "Settlement is in two different currencies.";
			owner_lazy = () -> SettlementTransactionConditionCode.mmObject();
			codeName = "SPCS";
		}
	};
	/**
	 * Settlement transactions to be settled with special delivery.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionCode
	 * SettlementTransactionConditionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SPDL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpecialDelivery"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Settlement transactions to be settled with special delivery."</li>
	 * </ul>
	 */
	public static final MMCode SpecialDelivery = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SpecialDelivery";
			definition = "Settlement transactions to be settled with special delivery.";
			owner_lazy = () -> SettlementTransactionConditionCode.mmObject();
			codeName = "SPDL";
		}
	};
	/**
	 * Money and financial instruments settle in different locations.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionCode
	 * SettlementTransactionConditionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SPST"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SplitSettlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Money and financial instruments settle in different locations."</li>
	 * </ul>
	 */
	public static final MMCode SplitSettlement = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SplitSettlement";
			definition = "Money and financial instruments settle in different locations.";
			owner_lazy = () -> SettlementTransactionConditionCode.mmObject();
			codeName = "SPST";
		}
	};
	/**
	 * Delivery cannot be performed until money is received.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionCode
	 * SettlementTransactionConditionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UNEX"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Unexposed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Delivery cannot be performed until money is received."</li>
	 * </ul>
	 */
	public static final MMCode Unexposed = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Unexposed";
			definition = "Delivery cannot be performed until money is received.";
			owner_lazy = () -> SettlementTransactionConditionCode.mmObject();
			codeName = "UNEX";
		}
	};
	/**
	 * Settlement transaction relates to options, futures or derivatives that
	 * have expired.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionCode
	 * SettlementTransactionConditionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EXPI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Expired"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Settlement transaction relates to options, futures or derivatives that have expired."
	 * </li>
	 * </ul>
	 */
	public static final MMCode Expired = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Expired";
			definition = "Settlement transaction relates to options, futures or derivatives that have expired.";
			owner_lazy = () -> SettlementTransactionConditionCode.mmObject();
			codeName = "EXPI";
		}
	};
	/**
	 * Position to cover the pending sale will be available by contractual
	 * settlement date (accounting information).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionCode
	 * SettlementTransactionConditionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PENS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingSale"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Position to cover the pending sale will be available by contractual settlement date (accounting information)."
	 * </li>
	 * </ul>
	 */
	public static final MMCode PendingSale = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PendingSale";
			definition = "Position to cover the pending sale will be available by contractual settlement date (accounting information).";
			owner_lazy = () -> SettlementTransactionConditionCode.mmObject();
			codeName = "PENS";
		}
	};
	/**
	 * Securities are not be delivered but segregated following triparty
	 * collateral transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionCode
	 * SettlementTransactionConditionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TRIP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TripartySegregation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Securities are not be delivered but segregated following triparty collateral transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMCode TripartySegregation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TripartySegregation";
			definition = "Securities are not be delivered but segregated following triparty collateral transaction.";
			owner_lazy = () -> SettlementTransactionConditionCode.mmObject();
			codeName = "TRIP";
		}
	};
	/**
	 * No market claim should be automatically generated.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionCode
	 * SettlementTransactionConditionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NOMC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoAutomaticMarketClaim"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "No market claim should be automatically generated."</li>
	 * </ul>
	 */
	public static final MMCode NoAutomaticMarketClaim = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NoAutomaticMarketClaim";
			definition = "No market claim should be automatically generated.";
			owner_lazy = () -> SettlementTransactionConditionCode.mmObject();
			codeName = "NOMC";
		}
	};
	/**
	 * Transaction resulting from a transformation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionCode
	 * SettlementTransactionConditionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TRAN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Transformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction resulting from a transformation."</li>
	 * </ul>
	 */
	public static final MMCode Transformation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Transformation";
			definition = "Transaction resulting from a transformation.";
			owner_lazy = () -> SettlementTransactionConditionCode.mmObject();
			codeName = "TRAN";
		}
	};
	/**
	 * Collateral position is available for other purposes (for example, onwards
	 * delivery).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionCode
	 * SettlementTransactionConditionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RHYP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rehypothecation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Collateral position is available for other purposes (for example, onwards delivery)."
	 * </li>
	 * </ul>
	 */
	public static final MMCode Rehypothecation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Rehypothecation";
			definition = "Collateral position is available for other purposes (for example, onwards delivery).";
			owner_lazy = () -> SettlementTransactionConditionCode.mmObject();
			codeName = "RHYP";
		}
	};
	/**
	 * Settlement is on a bilaterally accepted transaction that is to be
	 * accepted beyond the regular settlement deadline.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionCode
	 * SettlementTransactionConditionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ADEA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcceptAfterRegularSettlementDeadline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Settlement is on a bilaterally accepted transaction that is to be accepted beyond the regular settlement deadline."
	 * </li>
	 * </ul>
	 */
	public static final MMCode AcceptAfterRegularSettlementDeadline = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AcceptAfterRegularSettlementDeadline";
			definition = "Settlement is on a bilaterally accepted transaction that is to be accepted beyond the regular settlement deadline.";
			owner_lazy = () -> SettlementTransactionConditionCode.mmObject();
			codeName = "ADEA";
		}
	};
	/**
	 * Relates to a transaction that is for reporting purposes only.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionCode
	 * SettlementTransactionConditionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RPTO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reporting"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Relates to a transaction that is for reporting purposes only."</li>
	 * </ul>
	 */
	public static final MMCode Reporting = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reporting";
			definition = "Relates to a transaction that is for reporting purposes only.";
			owner_lazy = () -> SettlementTransactionConditionCode.mmObject();
			codeName = "RPTO";
		}
	};
	/**
	 * Security transaction is not for accounting.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionCode
	 * SettlementTransactionConditionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NACT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotAccountingRelated"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Security transaction is not for accounting."</li>
	 * </ul>
	 */
	public static final MMCode NotAccountingRelated = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotAccountingRelated";
			definition = "Security transaction is not for accounting.";
			owner_lazy = () -> SettlementTransactionConditionCode.mmObject();
			codeName = "NACT";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("PART");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SettlementTransactionConditionCode";
				definition = "Collateral position is available for other purposes (for example, onwards delivery).";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SettlementTransactionConditionCode.PartialAllowed, com.tools20022.repository.codeset.SettlementTransactionConditionCode.PartialNotAllowed,
						com.tools20022.repository.codeset.SettlementTransactionConditionCode.PartialSettlementCashThresholdAllowed,
						com.tools20022.repository.codeset.SettlementTransactionConditionCode.PartialSettlementQuantityThresholdAllowed, com.tools20022.repository.codeset.SettlementTransactionConditionCode.Assignement,
						com.tools20022.repository.codeset.SettlementTransactionConditionCode.BuytoCover, com.tools20022.repository.codeset.SettlementTransactionConditionCode.Clean,
						com.tools20022.repository.codeset.SettlementTransactionConditionCode.Dirty, com.tools20022.repository.codeset.SettlementTransactionConditionCode.DeliveryWithoutMatching,
						com.tools20022.repository.codeset.SettlementTransactionConditionCode.Drawn, com.tools20022.repository.codeset.SettlementTransactionConditionCode.Exercised,
						com.tools20022.repository.codeset.SettlementTransactionConditionCode.FreeCleanSettlement, com.tools20022.repository.codeset.SettlementTransactionConditionCode.KnockedOut,
						com.tools20022.repository.codeset.SettlementTransactionConditionCode.Physical, com.tools20022.repository.codeset.SettlementTransactionConditionCode.Residual,
						com.tools20022.repository.codeset.SettlementTransactionConditionCode.ShortSell, com.tools20022.repository.codeset.SettlementTransactionConditionCode.SplitCurrencySettlement,
						com.tools20022.repository.codeset.SettlementTransactionConditionCode.SpecialDelivery, com.tools20022.repository.codeset.SettlementTransactionConditionCode.SplitSettlement,
						com.tools20022.repository.codeset.SettlementTransactionConditionCode.Unexposed, com.tools20022.repository.codeset.SettlementTransactionConditionCode.Expired,
						com.tools20022.repository.codeset.SettlementTransactionConditionCode.PendingSale, com.tools20022.repository.codeset.SettlementTransactionConditionCode.TripartySegregation,
						com.tools20022.repository.codeset.SettlementTransactionConditionCode.NoAutomaticMarketClaim, com.tools20022.repository.codeset.SettlementTransactionConditionCode.Transformation,
						com.tools20022.repository.codeset.SettlementTransactionConditionCode.Rehypothecation, com.tools20022.repository.codeset.SettlementTransactionConditionCode.AcceptAfterRegularSettlementDeadline,
						com.tools20022.repository.codeset.SettlementTransactionConditionCode.Reporting, com.tools20022.repository.codeset.SettlementTransactionConditionCode.NotAccountingRelated);
			}
		});
		return mmObject_lazy.get();
	}
}