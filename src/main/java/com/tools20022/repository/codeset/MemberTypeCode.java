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
 * Specifies the nature of the membership of a party in a system. A system may
 * recognise different types of membership, with different related rights and
 * obligations.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.MemberTypeCode#Direct
 * MemberTypeCode.Direct}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.MemberTypeCode#Indirect
 * MemberTypeCode.Indirect}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.MemberTypeCode#Remote
 * MemberTypeCode.Remote}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.MemberTypeCode#EURO1
 * MemberTypeCode.EURO1}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.MemberTypeCode#STEP1
 * MemberTypeCode.STEP1}</li>
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
 * <li>"DRCT"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "MemberTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the nature of the membership of a party in a system. A system may recognise different types of membership, with different related rights and obligations."
 * </li>
 * </ul>
 */
public class MemberTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Member has full rights in the system. In principle, this membership
	 * status entails financial responsibility for its own operations and
	 * sponsored members' operations submitted to the system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MemberTypeCode
	 * MemberTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DRCT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Direct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Member has full rights in the system. In principle, this membership status entails financial responsibility for its own operations and sponsored members' operations submitted to the system."
	 * </li>
	 * </ul>
	 */
	public static final MMCode Direct = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Direct";
			definition = "Member has full rights in the system. In principle, this membership status entails financial responsibility for its own operations and sponsored members' operations submitted to the system.";
			owner_lazy = () -> MemberTypeCode.mmObject();
			codeName = "DRCT";
		}
	};
	/**
	 * Member has limited rights in the system specifications. In principle,
	 * this membership status entails no financial responsibility for its
	 * operations submitted to the system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MemberTypeCode
	 * MemberTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IDRT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Indirect"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Member has limited rights in the system specifications. In principle, this membership status entails no financial responsibility for its operations submitted to the system."
	 * </li>
	 * </ul>
	 */
	public static final MMCode Indirect = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Indirect";
			definition = "Member has limited rights in the system specifications. In principle, this membership status entails no financial responsibility for its operations submitted to the system.";
			owner_lazy = () -> MemberTypeCode.mmObject();
			codeName = "IDRT";
		}
	};
	/**
	 * Member has access to the system from a remote location or through remote
	 * technical means.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MemberTypeCode
	 * MemberTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RMTE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Remote"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Member has access to the system from a remote location or through remote technical means."
	 * </li>
	 * </ul>
	 */
	public static final MMCode Remote = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Remote";
			definition = "Member has access to the system from a remote location or through remote technical means.";
			owner_lazy = () -> MemberTypeCode.mmObject();
			codeName = "RMTE";
		}
	};
	/**
	 * Member is entitled to access the Euro1 system of the Euro Banking
	 * Association (EBA).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MemberTypeCode
	 * MemberTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EURO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EURO1"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Member is entitled to access the Euro1 system of the Euro Banking Association (EBA)."
	 * </li>
	 * </ul>
	 */
	public static final MMCode EURO1 = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EURO1";
			definition = "Member is entitled to access the Euro1 system of the Euro Banking Association (EBA).";
			owner_lazy = () -> MemberTypeCode.mmObject();
			codeName = "EURO";
		}
	};
	/**
	 * Member is entitled to access the Step1 system of the Euro Banking
	 * Association (EBA).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MemberTypeCode
	 * MemberTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "STEP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "STEP1"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Member is entitled to access the Step1 system of the Euro Banking Association (EBA)."
	 * </li>
	 * </ul>
	 */
	public static final MMCode STEP1 = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "STEP1";
			definition = "Member is entitled to access the Step1 system of the Euro Banking Association (EBA).";
			owner_lazy = () -> MemberTypeCode.mmObject();
			codeName = "STEP";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("DRCT");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "MemberTypeCode";
				definition = "Specifies the nature of the membership of a party in a system. A system may recognise different types of membership, with different related rights and obligations.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.MemberTypeCode.Direct, com.tools20022.repository.codeset.MemberTypeCode.Indirect, com.tools20022.repository.codeset.MemberTypeCode.Remote,
						com.tools20022.repository.codeset.MemberTypeCode.EURO1, com.tools20022.repository.codeset.MemberTypeCode.STEP1);
			}
		});
		return mmObject_lazy.get();
	}
}