import React, { useEffect, useState } from 'react'
import { useParams } from 'react-router-dom'

function GitHub() {
  const { username="notkirtann"  } = useParams()
  const [data, setData] = useState(null)

  useEffect(() => {
    async function fetchGitHubUser() {
      try {
        const response = await fetch(
          `https://api.github.com/users/${username}`
        )
        const result = await response.json()
        setData(result)
      } catch (error) {
        console.error(error)
      }
    }

    fetchGitHubUser()
  }, [username])

  if (!data) {
    return <div className="text-center m-4">Loading...</div>
  }

  return (
    <div className="text-center m-4 text-black bg-fuchsia-300 p-4 rounded">
      <p>GitHub Name: {data.name}</p>
      <p>GitHub Followers: {data.followers}</p>
      <img src={data.avatar_url} width={300} />
    </div>
  )
}

export default GitHub