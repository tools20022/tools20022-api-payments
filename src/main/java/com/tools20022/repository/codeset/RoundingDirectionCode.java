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
 * Specifies the rounding direction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.RoundingDirectionCode#Full
 * RoundingDirectionCode.Full}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RoundingDirectionCode#NoFraction
 * RoundingDirectionCode.NoFraction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RoundingDirectionCode#ProRate
 * RoundingDirectionCode.ProRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RoundingDirectionCode#RoundUp
 * RoundingDirectionCode.RoundUp}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RoundingDirectionCode#RoundDown
 * RoundingDirectionCode.RoundDown}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RoundingDirectionCode#RoundToNearest
 * RoundingDirectionCode.RoundToNearest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RoundingDirectionCode#IssueFraction
 * RoundingDirectionCode.IssueFraction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RoundingDirectionCode#DiscussFirst
 * RoundingDirectionCode.DiscussFirst}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RoundingDirectionCode#Specific
 * RoundingDirectionCode.Specific}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RoundingDirectionCode#Standard
 * RoundingDirectionCode.Standard}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RoundingDirectionCode#Retain
 * RoundingDirectionCode.Retain}</li>
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
 * <li>"FULL"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "RoundingDirectionCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the rounding direction."</li>
 * </ul>
 */
public class RoundingDirectionCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Pre-allocate shares only if fully dealt.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RoundingDirectionCode
	 * RoundingDirectionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FULL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Full"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Pre-allocate shares only if fully dealt."</li>
	 * </ul>
	 */
	public static final MMCode Full = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Full";
			definition = "Pre-allocate shares only if fully dealt.";
			owner_lazy = () -> RoundingDirectionCode.mmObject();
			codeName = "FULL";
		}
	};
	/**
	 * No fractional shares are allowed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RoundingDirectionCode
	 * RoundingDirectionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NOFR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoFraction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "No fractional shares are allowed."</li>
	 * </ul>
	 */
	public static final MMCode NoFraction = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NoFraction";
			definition = "No fractional shares are allowed.";
			owner_lazy = () -> RoundingDirectionCode.mmObject();
			codeName = "NOFR";
		}
	};
	/**
	 * In case of a partial fill, pro-rate the allocations.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RoundingDirectionCode
	 * RoundingDirectionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PROR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "In case of a partial fill, pro-rate the allocations."</li>
	 * </ul>
	 */
	public static final MMCode ProRate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ProRate";
			definition = "In case of a partial fill, pro-rate the allocations.";
			owner_lazy = () -> RoundingDirectionCode.mmObject();
			codeName = "PROR";
		}
	};
	/**
	 * Round up to the nearest whole number.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RoundingDirectionCode
	 * RoundingDirectionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RDUP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RoundUp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Round up to the nearest whole number."</li>
	 * </ul>
	 */
	public static final MMCode RoundUp = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RoundUp";
			definition = "Round up to the nearest whole number.";
			owner_lazy = () -> RoundingDirectionCode.mmObject();
			codeName = "RDUP";
		}
	};
	/**
	 * Round down to the nearest whole number.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RoundingDirectionCode
	 * RoundingDirectionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RDWN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RoundDown"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Round down to the nearest whole number."</li>
	 * </ul>
	 */
	public static final MMCode RoundDown = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RoundDown";
			definition = "Round down to the nearest whole number.";
			owner_lazy = () -> RoundingDirectionCode.mmObject();
			codeName = "RDWN";
		}
	};
	/**
	 * Round up or down to the nearest whole number.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RoundingDirectionCode
	 * RoundingDirectionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "STAN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RoundToNearest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Round up or down to the nearest whole number."</li>
	 * </ul>
	 */
	public static final MMCode RoundToNearest = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RoundToNearest";
			definition = "Round up or down to the nearest whole number.";
			owner_lazy = () -> RoundingDirectionCode.mmObject();
			codeName = "STAN";
		}
	};
	/**
	 * Do not round.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RoundingDirectionCode
	 * RoundingDirectionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DIST"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssueFraction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Do not round."</li>
	 * </ul>
	 */
	public static final MMCode IssueFraction = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IssueFraction";
			definition = "Do not round.";
			owner_lazy = () -> RoundingDirectionCode.mmObject();
			codeName = "DIST";
		}
	};
	/**
	 * Do not pro-rate; discuss first.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RoundingDirectionCode
	 * RoundingDirectionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TALK"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DiscussFirst"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Do not pro-rate; discuss first."</li>
	 * </ul>
	 */
	public static final MMCode DiscussFirst = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DiscussFirst";
			definition = "Do not pro-rate; discuss first.";
			owner_lazy = () -> RoundingDirectionCode.mmObject();
			codeName = "TALK";
		}
	};
	/**
	 * Pre-allocate according to the amounts shown in a linked allocation
	 * instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RoundingDirectionCode
	 * RoundingDirectionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SPEC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Specific"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Pre-allocate according to the amounts shown in a linked allocation instruction."
	 * </li>
	 * </ul>
	 */
	public static final MMCode Specific = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Specific";
			definition = "Pre-allocate according to the amounts shown in a linked allocation instruction.";
			owner_lazy = () -> RoundingDirectionCode.mmObject();
			codeName = "SPEC";
		}
	};
	/**
	 * Indicates that if the fraction is greater than or equal to 0.5 of the
	 * value should be rounded up; otherwise rounded down.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RoundingDirectionCode
	 * RoundingDirectionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SSTD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Standard"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that if the fraction is greater than or equal to 0.5 of the value should be rounded up; otherwise rounded down."
	 * </li>
	 * </ul>
	 */
	public static final MMCode Standard = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Standard";
			definition = "Indicates that if the fraction is greater than or equal to 0.5 of the value should be rounded up; otherwise rounded down.";
			owner_lazy = () -> RoundingDirectionCode.mmObject();
			codeName = "SSTD";
		}
	};
	/**
	 * Indicates that fractional value should be retained; no rounding.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RoundingDirectionCode
	 * RoundingDirectionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RETA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Retain"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that fractional value should be retained; no rounding."</li>
	 * </ul>
	 */
	public static final MMCode Retain = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Retain";
			definition = "Indicates that fractional value should be retained; no rounding.";
			owner_lazy = () -> RoundingDirectionCode.mmObject();
			codeName = "RETA";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("FULL");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "RoundingDirectionCode";
				definition = "Specifies the rounding direction.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.RoundingDirectionCode.Full, com.tools20022.repository.codeset.RoundingDirectionCode.NoFraction,
						com.tools20022.repository.codeset.RoundingDirectionCode.ProRate, com.tools20022.repository.codeset.RoundingDirectionCode.RoundUp, com.tools20022.repository.codeset.RoundingDirectionCode.RoundDown,
						com.tools20022.repository.codeset.RoundingDirectionCode.RoundToNearest, com.tools20022.repository.codeset.RoundingDirectionCode.IssueFraction, com.tools20022.repository.codeset.RoundingDirectionCode.DiscussFirst,
						com.tools20022.repository.codeset.RoundingDirectionCode.Specific, com.tools20022.repository.codeset.RoundingDirectionCode.Standard, com.tools20022.repository.codeset.RoundingDirectionCode.Retain);
			}
		});
		return mmObject_lazy.get();
	}
}