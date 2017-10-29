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
import com.tools20022.repository.codeset.BillingChargeMethodCode;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Defines how the billing charge is calculated.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.BillingChargeMethodCode
 * BillingChargeMethodCode}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BillingChargeMethod1Code#UnitPriced
 * BillingChargeMethod1Code.UnitPriced}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BillingChargeMethod1Code#StampDuty
 * BillingChargeMethod1Code.StampDuty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BillingChargeMethod1Code#BaseCharge
 * BillingChargeMethod1Code.BaseCharge}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BillingChargeMethod1Code#DiscountPrice
 * BillingChargeMethod1Code.DiscountPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BillingChargeMethod1Code#FlatCharge
 * BillingChargeMethod1Code.FlatCharge}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BillingChargeMethod1Code#ListPrice
 * BillingChargeMethod1Code.ListPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BillingChargeMethod1Code#MinimumCharge
 * BillingChargeMethod1Code.MinimumCharge}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BillingChargeMethod1Code#MaximumReduction
 * BillingChargeMethod1Code.MaximumReduction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BillingChargeMethod1Code#Tier1
 * BillingChargeMethod1Code.Tier1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BillingChargeMethod1Code#Tier2
 * BillingChargeMethod1Code.Tier2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BillingChargeMethod1Code#Tier3
 * BillingChargeMethod1Code.Tier3}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BillingChargeMethod1Code#Tier4
 * BillingChargeMethod1Code.Tier4}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BillingChargeMethod1Code#Tier5
 * BillingChargeMethod1Code.Tier5}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BillingChargeMethod1Code#Tier6
 * BillingChargeMethod1Code.Tier6}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BillingChargeMethod1Code#Tier7
 * BillingChargeMethod1Code.Tier7}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BillingChargeMethod1Code#Tier8
 * BillingChargeMethod1Code.Tier8}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BillingChargeMethod1Code#Tier9
 * BillingChargeMethod1Code.Tier9}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BillingChargeMethod1Code#ThresholdPrice
 * BillingChargeMethod1Code.ThresholdPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BillingChargeMethod1Code#ZonePrice
 * BillingChargeMethod1Code.ZonePrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BillingChargeMethod1Code#BalanceBased
 * BillingChargeMethod1Code.BalanceBased}</li>
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
 * <li>"UPRC"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "BillingChargeMethod1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Defines how the billing charge is calculated."</li>
 * </ul>
 */
public class BillingChargeMethod1Code extends BillingChargeMethodCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BillingChargeMethod1Code
	 * BillingChargeMethod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnitPriced"</li>
	 * </ul>
	 */
	public static final MMCode UnitPriced = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnitPriced";
			owner_lazy = () -> BillingChargeMethod1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BillingChargeMethod1Code
	 * BillingChargeMethod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StampDuty"</li>
	 * </ul>
	 */
	public static final MMCode StampDuty = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StampDuty";
			owner_lazy = () -> BillingChargeMethod1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BillingChargeMethod1Code
	 * BillingChargeMethod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BaseCharge"</li>
	 * </ul>
	 */
	public static final MMCode BaseCharge = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BaseCharge";
			owner_lazy = () -> BillingChargeMethod1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BillingChargeMethod1Code
	 * BillingChargeMethod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DiscountPrice"</li>
	 * </ul>
	 */
	public static final MMCode DiscountPrice = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DiscountPrice";
			owner_lazy = () -> BillingChargeMethod1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BillingChargeMethod1Code
	 * BillingChargeMethod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FlatCharge"</li>
	 * </ul>
	 */
	public static final MMCode FlatCharge = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FlatCharge";
			owner_lazy = () -> BillingChargeMethod1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BillingChargeMethod1Code
	 * BillingChargeMethod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ListPrice"</li>
	 * </ul>
	 */
	public static final MMCode ListPrice = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ListPrice";
			owner_lazy = () -> BillingChargeMethod1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BillingChargeMethod1Code
	 * BillingChargeMethod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumCharge"</li>
	 * </ul>
	 */
	public static final MMCode MinimumCharge = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MinimumCharge";
			owner_lazy = () -> BillingChargeMethod1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BillingChargeMethod1Code
	 * BillingChargeMethod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaximumReduction"</li>
	 * </ul>
	 */
	public static final MMCode MaximumReduction = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaximumReduction";
			owner_lazy = () -> BillingChargeMethod1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BillingChargeMethod1Code
	 * BillingChargeMethod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Tier1"</li>
	 * </ul>
	 */
	public static final MMCode Tier1 = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Tier1";
			owner_lazy = () -> BillingChargeMethod1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BillingChargeMethod1Code
	 * BillingChargeMethod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Tier2"</li>
	 * </ul>
	 */
	public static final MMCode Tier2 = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Tier2";
			owner_lazy = () -> BillingChargeMethod1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BillingChargeMethod1Code
	 * BillingChargeMethod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Tier3"</li>
	 * </ul>
	 */
	public static final MMCode Tier3 = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Tier3";
			owner_lazy = () -> BillingChargeMethod1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BillingChargeMethod1Code
	 * BillingChargeMethod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Tier4"</li>
	 * </ul>
	 */
	public static final MMCode Tier4 = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Tier4";
			owner_lazy = () -> BillingChargeMethod1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BillingChargeMethod1Code
	 * BillingChargeMethod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Tier5"</li>
	 * </ul>
	 */
	public static final MMCode Tier5 = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Tier5";
			owner_lazy = () -> BillingChargeMethod1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BillingChargeMethod1Code
	 * BillingChargeMethod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Tier6"</li>
	 * </ul>
	 */
	public static final MMCode Tier6 = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Tier6";
			owner_lazy = () -> BillingChargeMethod1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BillingChargeMethod1Code
	 * BillingChargeMethod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Tier7"</li>
	 * </ul>
	 */
	public static final MMCode Tier7 = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Tier7";
			owner_lazy = () -> BillingChargeMethod1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BillingChargeMethod1Code
	 * BillingChargeMethod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Tier8"</li>
	 * </ul>
	 */
	public static final MMCode Tier8 = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Tier8";
			owner_lazy = () -> BillingChargeMethod1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BillingChargeMethod1Code
	 * BillingChargeMethod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Tier9"</li>
	 * </ul>
	 */
	public static final MMCode Tier9 = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Tier9";
			owner_lazy = () -> BillingChargeMethod1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BillingChargeMethod1Code
	 * BillingChargeMethod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ThresholdPrice"</li>
	 * </ul>
	 */
	public static final MMCode ThresholdPrice = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ThresholdPrice";
			owner_lazy = () -> BillingChargeMethod1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BillingChargeMethod1Code
	 * BillingChargeMethod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ZonePrice"</li>
	 * </ul>
	 */
	public static final MMCode ZonePrice = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ZonePrice";
			owner_lazy = () -> BillingChargeMethod1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BillingChargeMethod1Code
	 * BillingChargeMethod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceBased"</li>
	 * </ul>
	 */
	public static final MMCode BalanceBased = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceBased";
			owner_lazy = () -> BillingChargeMethod1Code.mmObject();
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("UPRC");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "BillingChargeMethod1Code";
				definition = "Defines how the billing charge is calculated.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.BillingChargeMethod1Code.UnitPriced, com.tools20022.repository.codeset.BillingChargeMethod1Code.StampDuty,
						com.tools20022.repository.codeset.BillingChargeMethod1Code.BaseCharge, com.tools20022.repository.codeset.BillingChargeMethod1Code.DiscountPrice, com.tools20022.repository.codeset.BillingChargeMethod1Code.FlatCharge,
						com.tools20022.repository.codeset.BillingChargeMethod1Code.ListPrice, com.tools20022.repository.codeset.BillingChargeMethod1Code.MinimumCharge,
						com.tools20022.repository.codeset.BillingChargeMethod1Code.MaximumReduction, com.tools20022.repository.codeset.BillingChargeMethod1Code.Tier1, com.tools20022.repository.codeset.BillingChargeMethod1Code.Tier2,
						com.tools20022.repository.codeset.BillingChargeMethod1Code.Tier3, com.tools20022.repository.codeset.BillingChargeMethod1Code.Tier4, com.tools20022.repository.codeset.BillingChargeMethod1Code.Tier5,
						com.tools20022.repository.codeset.BillingChargeMethod1Code.Tier6, com.tools20022.repository.codeset.BillingChargeMethod1Code.Tier7, com.tools20022.repository.codeset.BillingChargeMethod1Code.Tier8,
						com.tools20022.repository.codeset.BillingChargeMethod1Code.Tier9, com.tools20022.repository.codeset.BillingChargeMethod1Code.ThresholdPrice, com.tools20022.repository.codeset.BillingChargeMethod1Code.ZonePrice,
						com.tools20022.repository.codeset.BillingChargeMethod1Code.BalanceBased);
				trace_lazy = () -> BillingChargeMethodCode.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}