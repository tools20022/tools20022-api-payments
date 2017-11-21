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
 * Indicates the type of redemption at maturity.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MaturityRedemptionTypeCode#mmFinalRedemption
 * MaturityRedemptionTypeCode.mmFinalRedemption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MaturityRedemptionTypeCode#mmPartialRedemptionWithoutReduction
 * MaturityRedemptionTypeCode.mmPartialRedemptionWithoutReduction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MaturityRedemptionTypeCode#mmPartialRedemptionWithReduction
 * MaturityRedemptionTypeCode.mmPartialRedemptionWithReduction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MaturityRedemptionTypeCode#mmDrawingAtRandom
 * MaturityRedemptionTypeCode.mmDrawingAtRandom}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MaturityRedemptionTypeCode#mmDrawingProRata
 * MaturityRedemptionTypeCode.mmDrawingProRata}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MaturityRedemptionTypeCode#mmCall
 * MaturityRedemptionTypeCode.mmCall}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MaturityRedemptionTypeCode#mmPut
 * MaturityRedemptionTypeCode.mmPut}</li>
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
 * <li>"FRED"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "MaturityRedemptionTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Indicates the type of redemption at maturity."</li>
 * </ul>
 */
public class MaturityRedemptionTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Indicates that the type of redemption at maturity is final.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MaturityRedemptionTypeCode
	 * MaturityRedemptionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FRED"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinalRedemption"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that the type of redemption at maturity is final."</li>
	 * </ul>
	 */
	public static final MMCode mmFinalRedemption = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinalRedemption";
			definition = "Indicates that the type of redemption at maturity is final.";
			owner_lazy = () -> MaturityRedemptionTypeCode.mmObject();
			codeName = "FRED";
		}
	};
	/**
	 * Indicates that the type of redemption at maturity is partial without
	 * reduction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MaturityRedemptionTypeCode
	 * MaturityRedemptionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PRNR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialRedemptionWithoutReduction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that the type of redemption at maturity is partial without reduction."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmPartialRedemptionWithoutReduction = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialRedemptionWithoutReduction";
			definition = "Indicates that the type of redemption at maturity is partial without reduction.";
			owner_lazy = () -> MaturityRedemptionTypeCode.mmObject();
			codeName = "PRNR";
		}
	};
	/**
	 * Indicates that the type of redemption at maturity is partial with
	 * reduction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MaturityRedemptionTypeCode
	 * MaturityRedemptionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PRWR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialRedemptionWithReduction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that the type of redemption at maturity is partial with reduction."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmPartialRedemptionWithReduction = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialRedemptionWithReduction";
			definition = "Indicates that the type of redemption at maturity is partial with reduction.";
			owner_lazy = () -> MaturityRedemptionTypeCode.mmObject();
			codeName = "PRWR";
		}
	};
	/**
	 * Indicates that the type of redemption at maturity is drawing at random.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MaturityRedemptionTypeCode
	 * MaturityRedemptionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RNDM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DrawingAtRandom"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that the type of redemption at maturity is drawing at random."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmDrawingAtRandom = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DrawingAtRandom";
			definition = "Indicates that the type of redemption at maturity is drawing at random.";
			owner_lazy = () -> MaturityRedemptionTypeCode.mmObject();
			codeName = "RNDM";
		}
	};
	/**
	 * Indicates that the type of redemption at maturity is drawing pro-rata.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MaturityRedemptionTypeCode
	 * MaturityRedemptionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PRRA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DrawingProRata"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that the type of redemption at maturity is drawing pro-rata."</li>
	 * </ul>
	 */
	public static final MMCode mmDrawingProRata = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DrawingProRata";
			definition = "Indicates that the type of redemption at maturity is drawing pro-rata.";
			owner_lazy = () -> MaturityRedemptionTypeCode.mmObject();
			codeName = "PRRA";
		}
	};
	/**
	 * Indicates that the type of redemption at maturity is call.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MaturityRedemptionTypeCode
	 * MaturityRedemptionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CALL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Call"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that the type of redemption at maturity is call."</li>
	 * </ul>
	 */
	public static final MMCode mmCall = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Call";
			definition = "Indicates that the type of redemption at maturity is call.";
			owner_lazy = () -> MaturityRedemptionTypeCode.mmObject();
			codeName = "CALL";
		}
	};
	/**
	 * Indicates that the type of redemption at maturity is put.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MaturityRedemptionTypeCode
	 * MaturityRedemptionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PUUT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Put"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates that the type of redemption at maturity is put."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmPut = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Put";
			definition = "Indicates that the type of redemption at maturity is put.";
			owner_lazy = () -> MaturityRedemptionTypeCode.mmObject();
			codeName = "PUUT";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("FRED");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MaturityRedemptionTypeCode";
				definition = "Indicates the type of redemption at maturity.";
				code_lazy = () -> Arrays.asList(MaturityRedemptionTypeCode.mmFinalRedemption, MaturityRedemptionTypeCode.mmPartialRedemptionWithoutReduction, MaturityRedemptionTypeCode.mmPartialRedemptionWithReduction,
						MaturityRedemptionTypeCode.mmDrawingAtRandom, MaturityRedemptionTypeCode.mmDrawingProRata, MaturityRedemptionTypeCode.mmCall, MaturityRedemptionTypeCode.mmPut);
			}
		});
		return mmObject_lazy.get();
	}
}