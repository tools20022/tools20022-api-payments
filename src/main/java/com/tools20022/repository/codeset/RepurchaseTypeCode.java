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
 * Relates to a principal adjustment.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.RepurchaseTypeCode#Swap
 * RepurchaseTypeCode.Swap}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RepurchaseTypeCode#RepurchaseCall
 * RepurchaseTypeCode.RepurchaseCall}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.RepurchaseTypeCode#Pairoff
 * RepurchaseTypeCode.Pairoff}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RepurchaseTypeCode#RepoRate
 * RepurchaseTypeCode.RepoRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RepurchaseTypeCode#Rollover
 * RepurchaseTypeCode.Rollover}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.RepurchaseTypeCode#TopUp
 * RepurchaseTypeCode.TopUp}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RepurchaseTypeCode#Withdrawal
 * RepurchaseTypeCode.Withdrawal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RepurchaseTypeCode#PrincipalExposureAdjustment
 * RepurchaseTypeCode.PrincipalExposureAdjustment}</li>
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
 * <li>"CADJ"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "RepurchaseTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Relates to a principal adjustment."</li>
 * </ul>
 */
public class RepurchaseTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Relates to a Swap/Substitution.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RepurchaseTypeCode
	 * RepurchaseTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CADJ"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Swap"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Relates to a Swap/Substitution."</li>
	 * </ul>
	 */
	public static final MMCode Swap = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Swap";
			definition = "Relates to a Swap/Substitution.";
			owner_lazy = () -> RepurchaseTypeCode.mmObject();
			codeName = "CADJ";
		}
	};
	/**
	 * Relates to a change in the closing or maturity date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RepurchaseTypeCode
	 * RepurchaseTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CALL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RepurchaseCall"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Relates to a change in the closing or maturity date."</li>
	 * </ul>
	 */
	public static final MMCode RepurchaseCall = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RepurchaseCall";
			definition = "Relates to a change in the closing or maturity date.";
			owner_lazy = () -> RepurchaseTypeCode.mmObject();
			codeName = "CALL";
		}
	};
	/**
	 * Relates to a pair-off: the transaction is paired off and netted against
	 * one or more previous transactions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RepurchaseTypeCode
	 * RepurchaseTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PAIR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Pairoff"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Relates to a pair-off: the transaction is paired off and netted against one or more previous transactions."
	 * </li>
	 * </ul>
	 */
	public static final MMCode Pairoff = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Pairoff";
			definition = "Relates to a pair-off: the transaction is paired off and netted against one or more previous transactions.";
			owner_lazy = () -> RepurchaseTypeCode.mmObject();
			codeName = "PAIR";
		}
	};
	/**
	 * Is part of a pair-off.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RepurchaseTypeCode
	 * RepurchaseTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RATE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RepoRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Is part of a pair-off."</li>
	 * </ul>
	 */
	public static final MMCode RepoRate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RepoRate";
			definition = "Is part of a pair-off.";
			owner_lazy = () -> RepurchaseTypeCode.mmObject();
			codeName = "RATE";
		}
	};
	/**
	 * Relates to a repo rollover of a position extending the closing or
	 * maturity date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RepurchaseTypeCode
	 * RepurchaseTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ROLP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rollover"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Relates to a repo rollover of a position extending the closing or maturity date."
	 * </li>
	 * </ul>
	 */
	public static final MMCode Rollover = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Rollover";
			definition = "Relates to a repo rollover of a position extending the closing or maturity date.";
			owner_lazy = () -> RepurchaseTypeCode.mmObject();
			codeName = "ROLP";
		}
	};
	/**
	 * Relates to a repo rollover of a position extending the closing or
	 * maturity date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RepurchaseTypeCode
	 * RepurchaseTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TOPU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TopUp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Relates to a repo rollover of a position extending the closing or maturity date."
	 * </li>
	 * </ul>
	 */
	public static final MMCode TopUp = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TopUp";
			definition = "Relates to a repo rollover of a position extending the closing or maturity date.";
			owner_lazy = () -> RepurchaseTypeCode.mmObject();
			codeName = "TOPU";
		}
	};
	/**
	 * Relates to a repo rollover of a position extending the closing or
	 * maturity date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RepurchaseTypeCode
	 * RepurchaseTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "WTHD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Withdrawal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Relates to a repo rollover of a position extending the closing or maturity date."
	 * </li>
	 * </ul>
	 */
	public static final MMCode Withdrawal = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Withdrawal";
			definition = "Relates to a repo rollover of a position extending the closing or maturity date.";
			owner_lazy = () -> RepurchaseTypeCode.mmObject();
			codeName = "WTHD";
		}
	};
	/**
	 * Relates to a principal adjustment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RepurchaseTypeCode
	 * RepurchaseTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PADJ"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PrincipalExposureAdjustment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Relates to a principal adjustment."</li>
	 * </ul>
	 */
	public static final MMCode PrincipalExposureAdjustment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PrincipalExposureAdjustment";
			definition = "Relates to a principal adjustment.";
			owner_lazy = () -> RepurchaseTypeCode.mmObject();
			codeName = "PADJ";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("CADJ");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "RepurchaseTypeCode";
				definition = "Relates to a principal adjustment.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.RepurchaseTypeCode.Swap, com.tools20022.repository.codeset.RepurchaseTypeCode.RepurchaseCall, com.tools20022.repository.codeset.RepurchaseTypeCode.Pairoff,
						com.tools20022.repository.codeset.RepurchaseTypeCode.RepoRate, com.tools20022.repository.codeset.RepurchaseTypeCode.Rollover, com.tools20022.repository.codeset.RepurchaseTypeCode.TopUp,
						com.tools20022.repository.codeset.RepurchaseTypeCode.Withdrawal, com.tools20022.repository.codeset.RepurchaseTypeCode.PrincipalExposureAdjustment);
			}
		});
		return mmObject_lazy.get();
	}
}