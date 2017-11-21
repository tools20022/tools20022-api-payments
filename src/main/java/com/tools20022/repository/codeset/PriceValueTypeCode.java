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
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Price will not be paid.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PriceValueTypeCode#mmDiscount
 * PriceValueTypeCode.mmDiscount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PriceValueTypeCode#mmPremium
 * PriceValueTypeCode.mmPremium}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PriceValueTypeCode#mmPar
 * PriceValueTypeCode.mmPar}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PriceValueTypeCode#mmYield
 * PriceValueTypeCode.mmYield}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PriceValueTypeCode#mmSpread
 * PriceValueTypeCode.mmSpread}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PriceValueTypeCode#mmPerUnit
 * PriceValueTypeCode.mmPerUnit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PriceValueTypeCode#mmAbsolute
 * PriceValueTypeCode.mmAbsolute}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PriceValueTypeCode#mmTEDPrice
 * PriceValueTypeCode.mmTEDPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PriceValueTypeCode#mmTEDYield
 * PriceValueTypeCode.mmTEDYield}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PriceValueTypeCode#mmFixedCabinetTrade
 * PriceValueTypeCode.mmFixedCabinetTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PriceValueTypeCode#mmVariableCabinetTrade
 * PriceValueTypeCode.mmVariableCabinetTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PriceValueTypeCode#mmPercentage
 * PriceValueTypeCode.mmPercentage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PriceValueTypeCode#mmUnknown
 * PriceValueTypeCode.mmUnknown}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PriceValueTypeCode#mmOpenDated
 * PriceValueTypeCode.mmOpenDated}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PriceValueTypeCode#mmUnspecified
 * PriceValueTypeCode.mmUnspecified}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PriceValueTypeCode#mmToBeSpecified
 * PriceValueTypeCode.mmToBeSpecified}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PriceValueTypeCode#mmActualAmount
 * PriceValueTypeCode.mmActualAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PriceValueTypeCode#mmNilPayment
 * PriceValueTypeCode.mmNilPayment}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.PriceValueType1Code
 * PriceValueType1Code}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"DISC"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PriceValueTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Price will not be paid."</li>
 * </ul>
 */
public class PriceValueTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Price expressed as a number of percentage points below par, for example,
	 * a discount price of 2.0% equals a price of 98 when par is 100.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PriceValueTypeCode
	 * PriceValueTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DISC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Discount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Price expressed as a number of percentage points below par, for example, a discount price of 2.0% equals a price of 98 when par is 100."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmDiscount = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Discount";
			definition = "Price expressed as a number of percentage points below par, for example, a discount price of 2.0% equals a price of 98 when par is 100.";
			owner_lazy = () -> PriceValueTypeCode.mmObject();
			codeName = "DISC";
		}
	};
	/**
	 * Price expressed as a number of percentage points above par, for example,
	 * a premium price of 2.0% equals a price of 102 when par is 100.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PriceValueTypeCode
	 * PriceValueTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PREM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Premium"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Price expressed as a number of percentage points above par, for example, a premium price of 2.0% equals a price of 102 when par is 100."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmPremium = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Premium";
			definition = "Price expressed as a number of percentage points above par, for example, a premium price of 2.0% equals a price of 102 when par is 100.";
			owner_lazy = () -> PriceValueTypeCode.mmObject();
			codeName = "PREM";
		}
	};
	/**
	 * Price is the face amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PriceValueTypeCode
	 * PriceValueTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PARV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Par"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Price is the face amount."</li>
	 * </ul>
	 */
	public static final MMCode mmPar = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Par";
			definition = "Price is the face amount.";
			owner_lazy = () -> PriceValueTypeCode.mmObject();
			codeName = "PARV";
		}
	};
	/**
	 * Price expressed as a yield.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PriceValueTypeCode
	 * PriceValueTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "YIEL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Yield"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Price expressed as a yield."</li>
	 * </ul>
	 */
	public static final MMCode mmYield = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Yield";
			definition = "Price expressed as a yield.";
			owner_lazy = () -> PriceValueTypeCode.mmObject();
			codeName = "YIEL";
		}
	};
	/**
	 * Difference between a market maker's bid and asked price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PriceValueTypeCode
	 * PriceValueTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SPRE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Spread"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Difference between a market maker's bid and asked price."</li>
	 * </ul>
	 */
	public static final MMCode mmSpread = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Spread";
			definition = "Difference between a market maker's bid and asked price.";
			owner_lazy = () -> PriceValueTypeCode.mmObject();
			codeName = "SPRE";
		}
	};
	/**
	 * Price expressed per unit.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PriceValueTypeCode
	 * PriceValueTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PEUN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PerUnit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Price expressed per unit."</li>
	 * </ul>
	 */
	public static final MMCode mmPerUnit = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PerUnit";
			definition = "Price expressed per unit.";
			owner_lazy = () -> PriceValueTypeCode.mmObject();
			codeName = "PEUN";
		}
	};
	/**
	 * Price is expressed as absolute.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PriceValueTypeCode
	 * PriceValueTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ABSO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Absolute"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Price is expressed as absolute."</li>
	 * </ul>
	 */
	public static final MMCode mmAbsolute = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Absolute";
			definition = "Price is expressed as absolute.";
			owner_lazy = () -> PriceValueTypeCode.mmObject();
			codeName = "ABSO";
		}
	};
	/**
	 * Price is expressed as Treasury Euro Dollar price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PriceValueTypeCode
	 * PriceValueTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TEDP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TEDPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Price is expressed as Treasury Euro Dollar price."</li>
	 * </ul>
	 */
	public static final MMCode mmTEDPrice = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TEDPrice";
			definition = "Price is expressed as Treasury Euro Dollar price.";
			owner_lazy = () -> PriceValueTypeCode.mmObject();
			codeName = "TEDP";
		}
	};
	/**
	 * Price is expressed as Treasury Euro Dollar yield.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PriceValueTypeCode
	 * PriceValueTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TEDY"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TEDYield"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Price is expressed as Treasury Euro Dollar yield."</li>
	 * </ul>
	 */
	public static final MMCode mmTEDYield = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TEDYield";
			definition = "Price is expressed as Treasury Euro Dollar yield.";
			owner_lazy = () -> PriceValueTypeCode.mmObject();
			codeName = "TEDY";
		}
	};
	/**
	 * Cabinet trades are used to indicate prices that trade at a price lower
	 * than that available on an exchange and they can be fixed or variable
	 * (primarily used for listed futures and options).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PriceValueTypeCode
	 * PriceValueTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FICT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FixedCabinetTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cabinet trades are used to indicate prices that trade at a price lower than that available on an exchange and they can be fixed or variable (primarily used for listed futures and options)."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmFixedCabinetTrade = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FixedCabinetTrade";
			definition = "Cabinet trades are used to indicate prices that trade at a price lower than that available on an exchange and they can be fixed or variable (primarily used for listed futures and options).";
			owner_lazy = () -> PriceValueTypeCode.mmObject();
			codeName = "FICT";
		}
	};
	/**
	 * Cabinet trades are used to indicate prices that trade at a price lower
	 * than that available on an exchange and they can be fixed or variable
	 * (primarily used for listed futures and options).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PriceValueTypeCode
	 * PriceValueTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "VACT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VariableCabinetTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cabinet trades are used to indicate prices that trade at a price lower than that available on an exchange and they can be fixed or variable (primarily used for listed futures and options)."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmVariableCabinetTrade = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "VariableCabinetTrade";
			definition = "Cabinet trades are used to indicate prices that trade at a price lower than that available on an exchange and they can be fixed or variable (primarily used for listed futures and options).";
			owner_lazy = () -> PriceValueTypeCode.mmObject();
			codeName = "VACT";
		}
	};
	/**
	 * Price expressed as a percentage of par.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PriceValueTypeCode
	 * PriceValueTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PRCT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Percentage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Price expressed as a percentage of par."</li>
	 * </ul>
	 */
	public static final MMCode mmPercentage = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Percentage";
			definition = "Price expressed as a percentage of par.";
			owner_lazy = () -> PriceValueTypeCode.mmObject();
			codeName = "PRCT";
		}
	};
	/**
	 * Price is unknown by the sender or has not been established.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PriceValueTypeCode
	 * PriceValueTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UKWN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Unknown"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Price is unknown by the sender or has not been established."</li>
	 * </ul>
	 */
	public static final MMCode mmUnknown = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Unknown";
			definition = "Price is unknown by the sender or has not been established.";
			owner_lazy = () -> PriceValueTypeCode.mmObject();
			codeName = "UKWN";
		}
	};
	/**
	 * Price has not been established.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PriceValueTypeCode
	 * PriceValueTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OPEN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OpenDated"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Price has not been established."</li>
	 * </ul>
	 */
	public static final MMCode mmOpenDated = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OpenDated";
			definition = "Price has not been established.";
			owner_lazy = () -> PriceValueTypeCode.mmObject();
			codeName = "OPEN";
		}
	};
	/**
	 * Price is not required to be specified by account owner.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PriceValueTypeCode
	 * PriceValueTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UNSP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Unspecified"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Price is not required to be specified by account owner."</li>
	 * </ul>
	 */
	public static final MMCode mmUnspecified = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Unspecified";
			definition = "Price is not required to be specified by account owner.";
			owner_lazy = () -> PriceValueTypeCode.mmObject();
			codeName = "UNSP";
		}
	};
	/**
	 * Price to be specified by account owner.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PriceValueTypeCode
	 * PriceValueTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TBSP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ToBeSpecified"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Price to be specified by account owner."</li>
	 * </ul>
	 */
	public static final MMCode mmToBeSpecified = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ToBeSpecified";
			definition = "Price to be specified by account owner.";
			owner_lazy = () -> PriceValueTypeCode.mmObject();
			codeName = "TBSP";
		}
	};
	/**
	 * Price expressed as a currency and amount per unit or per share.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PriceValueTypeCode
	 * PriceValueTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ACTU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ActualAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Price expressed as a currency and amount per unit or per share."</li>
	 * </ul>
	 */
	public static final MMCode mmActualAmount = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ActualAmount";
			definition = "Price expressed as a currency and amount per unit or per share.";
			owner_lazy = () -> PriceValueTypeCode.mmObject();
			codeName = "ACTU";
		}
	};
	/**
	 * Price will not be paid.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PriceValueTypeCode
	 * PriceValueTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NILP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NilPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Price will not be paid."</li>
	 * </ul>
	 */
	public static final MMCode mmNilPayment = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NilPayment";
			definition = "Price will not be paid.";
			owner_lazy = () -> PriceValueTypeCode.mmObject();
			codeName = "NILP";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("DISC");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PriceValueTypeCode";
				definition = "Price will not be paid.";
				code_lazy = () -> Arrays.asList(PriceValueTypeCode.mmDiscount, PriceValueTypeCode.mmPremium, PriceValueTypeCode.mmPar, PriceValueTypeCode.mmYield, PriceValueTypeCode.mmSpread, PriceValueTypeCode.mmPerUnit,
						PriceValueTypeCode.mmAbsolute, PriceValueTypeCode.mmTEDPrice, PriceValueTypeCode.mmTEDYield, PriceValueTypeCode.mmFixedCabinetTrade, PriceValueTypeCode.mmVariableCabinetTrade, PriceValueTypeCode.mmPercentage,
						PriceValueTypeCode.mmUnknown, PriceValueTypeCode.mmOpenDated, PriceValueTypeCode.mmUnspecified, PriceValueTypeCode.mmToBeSpecified, PriceValueTypeCode.mmActualAmount, PriceValueTypeCode.mmNilPayment);
				derivation_lazy = () -> Arrays.asList(PriceValueType1Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}